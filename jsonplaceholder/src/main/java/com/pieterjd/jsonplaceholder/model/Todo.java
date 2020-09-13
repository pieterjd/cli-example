package com.pieterjd.jsonplaceholder.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Todo {
    private String title;
    private int userId, id;
    private boolean completed;
}
