package org.sci.books;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Collections;

@ComponentScan("org.sci.books")
@SpringBootApplication
public class BooksApplication {


	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(BooksApplication.class);
		app.setDefaultProperties(Collections
				.singletonMap("server.port", "8083"));
		app.run(args);


		//SpringApplication.run(BooksApplication.class, args);
	}

}
