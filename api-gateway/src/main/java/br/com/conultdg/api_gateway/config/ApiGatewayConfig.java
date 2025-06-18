//package br.com.conultdg.api_gateway.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//
//@Configuration
//public class ApiGatewayConfig {
//	
//	@Bean
//	public RouteLocator gatewayRoouter(RouteLocatorBuilder builder) {
//		
//		return builder.routes()
//				.route(p-> p.path("/get").uri("http://httpbin.org"))
//				.route(p-> p.path("/cambio-service/**").uri("lb://cambio-service"))
//				.route(p-> p.path("/book-service/**").uri("lb://book-service"))
//				.build();
//	}
//
//}
