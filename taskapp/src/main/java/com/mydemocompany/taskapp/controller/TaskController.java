package com.mydemocompany.taskapp.controller;

import com.mydemocompany.taskapp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/task")
public class TaskController {
    @Autowired
    private TaskService taskService;
    @GetMapping
    public List<String> fetchAllTasks(){
        return  taskService.fetchAllTask();
    }
    @PostMapping
    public String addTask(@RequestBody String task){
        return  taskService.addTask(task);
    }
    @DeleteMapping
    public String deleteTasks(@RequestBody String task){
        return taskService.deleteTask(task);
    }
}
