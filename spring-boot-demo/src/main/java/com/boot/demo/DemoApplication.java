package com.boot.demo;

import com.boot.demo.bean.Student;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "User Management Application",
		           description = "We manage CRUD operations for an user",
					version = "V1.4",
		contact = @Contact(name = "Joey", email = "joey_doey@gmail.com",
				url = "https:www.google.com"),
		license = @License(name = "Apache 2.0")),
		externalDocs = @ExternalDocumentation(description = "This is about"))
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

}
