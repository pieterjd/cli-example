package com.pieterjd.jsonplaceholder.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
    private String title;
    private int userId, id;
    private boolean completed;
}
