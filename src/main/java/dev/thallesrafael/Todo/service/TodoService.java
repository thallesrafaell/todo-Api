package dev.thallesrafael.Todo.service;

import dev.thallesrafael.Todo.model.Todo;
import dev.thallesrafael.Todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    public List<Todo> create(Todo todo) {
        todoRepository.save(todo);
        return todoRepository.findAll();
    }

    public List<Todo> delete(Long id) {
        todoRepository.deleteById(id);
        return todoRepository.findAll();
    }


}
