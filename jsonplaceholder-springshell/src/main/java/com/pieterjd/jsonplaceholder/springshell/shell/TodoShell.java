package com.pieterjd.jsonplaceholder.springshell.shell;


import com.pieterjd.jsonplaceholder.model.Todo;
import com.pieterjd.jsonplaceholder.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import org.springframework.shell.table.*;

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
    @ShellMethod("get all todos in a table - use 0 to get all todos")
    public String getTodosTable(@ShellOption(defaultValue = "0") int amount){
        List<Todo> todos = todoService.getAll();

        if(amount != 0)  todos = todos.subList(0,amount);
        TableModel tableModel = new BeanListTableModel<>(todos,"title","completed");
        return new TableBuilder(tableModel)
            .addHeaderBorder(BorderStyle.fancy_light)
            .addFullBorder(BorderStyle.oldschool)
             .build().render(160);

    }
}
