package br.com.conultdg.book_service.api.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.com.conultdg.book_service.dto.Cambio;
import br.com.conultdg.book_service.model.Book;
import br.com.conultdg.book_service.repository.BookRepository;

@RestController
@RequestMapping("/book-service")
public class BookController {
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private BookRepository repo;
	
	@GetMapping(value = "/{id}/{currency}")
	public Book getBook(@PathVariable("id")Long id, @PathVariable("currency") String currency) {
		var book = repo.findById(id).orElseThrow();
		var port = environment.getProperty("local.server.port");
		book.setEnvironment(port);
		book.setCurrency(currency);
		HashMap<String, String> params = new HashMap<>();
		params.put("amount", book.getPrice().toString());
		params.put("from", "USD");
		params.put("to", currency);
		var cambio = new RestTemplate().getForEntity("http://localhost:8001/cambio-service/{amount}/{from}/{to}", Cambio.class, params);
		book.setPrice(Double.parseDouble(cambio.getBody().getConvertedValue().toString()));
		return book;
	}

}
