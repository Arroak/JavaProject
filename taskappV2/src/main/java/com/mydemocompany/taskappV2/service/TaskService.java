package com.mydemocompany.taskappV2.service;

import com.mydemocompany.taskappV2.entity.TaskEntity;

import java.util.List;
import java.util.Optional;

public interface TaskService {
    List<TaskEntity> findAllTask();
    TaskEntity findById(Long id);
    TaskEntity saveTask(TaskEntity task);
    TaskEntity updateTask(TaskEntity task);
    void deleteTask(Long id);

}
