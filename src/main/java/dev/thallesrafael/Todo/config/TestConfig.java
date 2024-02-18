package dev.thallesrafael.Todo.config;

import dev.thallesrafael.Todo.model.Todo;
import dev.thallesrafael.Todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private TodoRepository todoRepository;


    @Override
    public void run(String... args) throws Exception {
        Todo todo1 = new Todo(null, "Study", false, "Study Java");
        Todo todo2 = new Todo(null, "Work", false, "Work with Java");
        Todo todo3 = new Todo(null, "Sleep", false, "Sleep after work");

        todoRepository.saveAll(List.of(todo1, todo2, todo3));

    }
}
