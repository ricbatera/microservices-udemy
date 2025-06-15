package br.com.conultdg.book_service.proxy;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.conultdg.book_service.dto.Cambio;


@FeignClient(name="cambio-service")
public interface CambioProxy {
	
	@GetMapping(value="cambio-service/{amount}/{from}/{to}")
	public Cambio getCambio(@PathVariable("amount") BigDecimal amount,
							@PathVariable("from") String from,
							@PathVariable("to")String to);

}
