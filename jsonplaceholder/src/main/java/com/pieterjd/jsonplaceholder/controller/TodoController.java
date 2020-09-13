package com.pieterjd.jsonplaceholder.controller;

import com.pieterjd.jsonplaceholder.model.Todo;
import com.pieterjd.jsonplaceholder.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping
    private List<Todo> getAll(){
        return todoService.getAll();
    }
    @GetMapping("/{id}")
    private Todo getById(@PathVariable  int id){
        return todoService.get(id);
    }

}
