package dev.thallesrafael.Todo.controller;

import dev.thallesrafael.Todo.model.Todo;
import dev.thallesrafael.Todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity<List<Todo>> create(@RequestBody Todo todo) {
        List<Todo> list = todoService.create(todo);
        return ResponseEntity.ok().body(list);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<List<Todo>> delete(@PathVariable Long id) {
        List<Todo> list = todoService.delete(id);
        return ResponseEntity.ok().body(list);
    }
}
