package com.example.toDo;

public class Task {

    private String name;
    private String description;
    private boolean isFinished;

    public String getName() {
        return name;
    }
// konstruktor 2 argumentowy
    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }
    // konstruktor 3 argumentowy
    public Task(String name, String description, boolean isFinished) {
        this(name, description);   // dwa argumenty wywoływujemy konstruktor 2 argumentowy z góry
        this.isFinished = isFinished;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }
}
