package com.mydemocompany.taskappV2.controller;

import com.mydemocompany.taskappV2.entity.TaskEntity;
import com.mydemocompany.taskappV2.service.TaskService;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/task")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @GetMapping
    public List<TaskEntity> findAllTask(){
        return taskService.findAllTask();
    }
    @GetMapping("/{id}")
    public Optional<TaskEntity> findById(@PathVariable("id") Long id){
        return  taskService.findById(id);
    }
    @PostMapping
    public  TaskEntity saveTask(@RequestBody TaskEntity task){
        return taskService.saveTask(task);
    }
    @PutMapping
    public TaskEntity updateTask(@RequestBody TaskEntity task){
        return taskService.updateTask(task);
    }
    @DeleteMapping("/{id}")
    public  void deleteTask(@PathVariable("id") Long id){
        taskService.deleteTask(id);
    }
}
