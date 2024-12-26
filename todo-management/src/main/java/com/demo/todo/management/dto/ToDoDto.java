package com.demo.todo.management.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ToDoDto {

    private Long id;

    private String title;

    private String description;

    private boolean completed;

    //boolean -> default value is false and for Boolean -> default value is null


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
