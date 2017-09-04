package com.mobdrops.namesa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@PropertySources({
		@PropertySource(value = "file:C:/desenvolvimento/workspacepocs/namesa/BackEnd/properties/application.properties", ignoreResourceNotFound = false) })
@Configuration
@ComponentScan("com.mobdrops.namesa")
@EnableAutoConfiguration
@SpringBootApplication
@EnableSwagger2
public class Application extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(applicationClass);
	}

	private static Class<Application> applicationClass = Application.class;

	@Bean
	public Docket swaggerSettings() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.mobdrops.namesa.controller")).paths(PathSelectors.any())
				.build().apiInfo(apiInfo());
	}

	/**
	 * API Info as it appears on the swagger-ui page
	 */
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("NaMesa REST API with Swagger").description("Spring REST Sample with Swagger")
				.termsOfServiceUrl("http://www.mobdrops.com.br/namesa/terms/ - Terms of service")
				.license("Apache License Version 2.0")
				.licenseUrl("https://github.com/IBM-Bluemix/news-aggregator/blob/master/LICENSE").version("0.0.1")
				.build();
	}

}
