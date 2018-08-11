package com.example.toDo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TaskController {
    @ResponseBody // zwróc mi stringa
    @PostMapping("/tasks")
    public  String create (
            @RequestParam String name,
            @RequestParam String description,
            @RequestParam (required = false )boolean finiszed,
            ModelMap modelMap    // dane do strony wrzuca
            ) {
        Task task = new Task(name, description, finiszed);
        modelMap.put("task", task);
        return "added" + task;

    }
    //scierzka
    @GetMapping("/")
public String add(){
        return "add";
    }
}
