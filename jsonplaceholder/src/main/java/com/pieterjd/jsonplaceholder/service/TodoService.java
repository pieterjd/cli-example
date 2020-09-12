package com.pieterjd.jsonplaceholder.service;

import com.pieterjd.jsonplaceholder.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class TodoService {

    @Autowired
    private RestTemplate restTemplate;
    private static final String ALL_URL = "https://jsonplaceholder.typicode.com/todos";
    private static final String SINGLE_URL="https://jsonplaceholder.typicode.com/todos/%s";

    public List<Todo> getAll(){
        Todo[] todos = restTemplate.getForObject(ALL_URL, Todo[].class);
        return Arrays.asList(todos);
    }

    public Todo get(int id){
        return restTemplate.getForObject(String.format(SINGLE_URL,id),Todo.class);
    }
}
