package dev.thallesrafael.Todo.controller;

import dev.thallesrafael.Todo.model.Todo;
import dev.thallesrafael.Todo.service.TodoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/todos")
@Tag(name = "Todo API")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    @Operation(summary = "/todos", method = "GET",description = "Methods for returning all todos.")
    public ResponseEntity<List<Todo>> findAll() {
        List<Todo> list = todoService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    @Operation(summary = "/todos",method = "POST", description = "Methods for create todo.")
    public ResponseEntity<List<Todo>> create(@RequestBody Todo todo) {
        List<Todo> list = todoService.create(todo);
        return ResponseEntity.ok().body(list);
    }

    @DeleteMapping(value = "/{id}")
    @Operation(summary = "/todos/1",method = "DELETE", description = "Methods for delete todo by id.")
    public ResponseEntity<List<Todo>> delete(@PathVariable Long id) {
        List<Todo> list = todoService.delete(id);
        return ResponseEntity.ok().body(list);
    }

    @PutMapping
    @Operation(summary = "/todos",method = "PUT", description = "Methods for update todo.")
    public ResponseEntity<List<Todo>> update(@RequestBody Todo obj) {
        List<Todo> list = todoService.update(obj);
        return ResponseEntity.ok().body(list);
    }
}
