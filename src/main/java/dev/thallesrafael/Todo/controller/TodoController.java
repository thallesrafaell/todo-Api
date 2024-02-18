package dev.thallesrafael.Todo.controller;

import dev.thallesrafael.Todo.model.Todo;
import dev.thallesrafael.Todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public ResponseEntity<List<Todo>> findAll() {
        List<Todo> list = todoService.findAll();
        return ResponseEntity.ok().body(list);
    }

}
