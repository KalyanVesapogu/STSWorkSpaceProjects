package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableWebMvc
@EnableSwagger2
@ComponentScan(basePackages = "com.example")
public class ProductRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductRestApplication.class, args);
	}

}
