package com.example.toDo;

import java.util.ArrayList;
import java.util.List;

public interface TaskDao {

    List<Task> findAll();
    void addTask(Task task);
    List<Task> findByStatus(boolean finished);
}