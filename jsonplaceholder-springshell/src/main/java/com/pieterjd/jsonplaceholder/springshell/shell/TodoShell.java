package com.pieterjd.jsonplaceholder.springshell.shell;


import com.pieterjd.jsonplaceholder.model.Todo;
import com.pieterjd.jsonplaceholder.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.util.List;

@ShellComponent
public class TodoShell {
    @Autowired
    private TodoService todoService;


    @ShellMethod("Get a specific todo")
    public Todo getTodo(@ShellOption(arity = 1) int id) {
        return todoService.get(id);
    }
    @ShellMethod("Get all todos")
    public List<Todo> getTodos() {
        return todoService.getAll();
    }
}
