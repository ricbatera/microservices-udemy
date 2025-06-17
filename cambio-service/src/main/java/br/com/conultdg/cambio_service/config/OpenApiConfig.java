package br.com.conultdg.cambio_service.config;

import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;

@OpenAPIDefinition(
		info =@Info(title = "API Cambio-Service", description = "API para converter USD em outras moedas. Ex: BRL", version = "v1", 
		contact = @io.swagger.v3.oas.annotations.info.Contact(name = "Ricardo Alves Roberto",email = "ricardo.roberto@rdrtech.com.br", url = "www.rdrtech.com.br")))
public class OpenApiConfig {
	
//	@Bean
//	public OpenAPI custonOpenAPI() {
//		return new OpenAPI()
//				.components(new Components())
//				.info(new io.swagger.v3.oas.models.info.Info()
//						.title("API Book-Service")
//						.version("v1")
//						.description("API de consulta a livros num base MySql")
//						.contact(new Contact()
//								.name("Ricardo Alves Roberto")
//								.email("ricardo.roberto@rdrtech.com.br")
//								.email("http://wwww.rdrtech.com.br"))
//						.license(new License()
//								.name("Apache 2.0")
//								.url("http://springdoc.org")));
//	}

}
