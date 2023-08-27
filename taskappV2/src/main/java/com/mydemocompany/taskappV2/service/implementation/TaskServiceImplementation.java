package com.mydemocompany.taskappV2.service.implementation;

import com.mydemocompany.taskappV2.entity.TaskEntity;
import com.mydemocompany.taskappV2.repository.TaskRepository;
import com.mydemocompany.taskappV2.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImplementation  implements TaskService {
    private final TaskRepository taskRepo;

    public TaskServiceImplementation(TaskRepository taskRepo) {
        this.taskRepo = taskRepo;
    }

    @Override
    public List<TaskEntity> findAllTask() {
        return taskRepo.findAll();
    }

    @Override
    public Optional<TaskEntity> findById(Long id) {
        return taskRepo.findById(id);
    }

    @Override
    public TaskEntity saveTask(TaskEntity task) {
        return taskRepo.save(task);
    }

    @Override
    public TaskEntity updateTask(TaskEntity task) {
        return taskRepo.save(task);
    }

    @Override
    public void deleteTask(Long id) {
        taskRepo.deleteById(id);

    }
}
