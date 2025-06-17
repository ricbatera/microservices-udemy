package br.com.conultdg.cambio_service.api.controller;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.conultdg.cambio_service.domain.model.Cambio;
import br.com.conultdg.cambio_service.repository.CambioRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Cambio Endpoints", description = "Todos os endpoints relacionados a conversão de moeda estão aqui.")
@RestController
@RequestMapping("cambio-service")
public class CambioController {
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private CambioRepository repo;
	
	@Operation(summary = "Converte uma valor (amount) de uma moeda (from) para outra moeda (to)")
	@GetMapping(value="{amount}/{from}/{to}")
	public Cambio getCambio(@PathVariable("amount") BigDecimal amount,
							@PathVariable("from") String from,
							@PathVariable("to")String to) {		
		var cambio = repo.findByFromAndTo(from, to);
		if(cambio == null) throw new RuntimeException("Currency Unsupported");
		var port = environment.getProperty("local.server.port");
		BigDecimal conversionFactor = cambio.getConvertionFactor();
		BigDecimal convertedValue = conversionFactor.multiply(amount);
		cambio.setConvertedValue(convertedValue.setScale(2, RoundingMode.CEILING));
		cambio.setEnvironment(port);
		return cambio;
	}

}
