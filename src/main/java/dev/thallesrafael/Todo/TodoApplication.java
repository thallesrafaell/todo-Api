package dev.thallesrafael.Todo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @io.swagger.v3.oas.annotations.info.Info(title = "Todo API", version = "1.0", description = "API enverioments for reforce the knowledge."))
public class TodoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

}
