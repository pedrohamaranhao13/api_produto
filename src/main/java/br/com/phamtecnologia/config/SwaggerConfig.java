package br.com.phamtecnologia.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {

	@Bean
	public  OpenAPI customOpenApi() {
		
		return new OpenAPI()
	            .info(new io.swagger.v3.oas.models.info.Info()
	                .title("API para controle de produtos")
	                .description("Projeto desenvolvido com Spring Boot e Spring Data JPA")
	                .version("1.0.0")
	                .contact(new io.swagger.v3.oas.models.info.Contact()
	                    .name("PHAM TECNOLOGIA")
	                    .url("http://www.phamtecnologia.com.br")
	                    .email("contato@phamtecnologia.com.br"))
	                .license(new License()
	                    .name("Apache 2.0")
	                    .url("http://www.apache.org/licenses/LICENSE-2.0.html")));
	}
}
