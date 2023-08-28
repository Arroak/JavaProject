package com.mydemocompany.taskappV2.service.implementation;
import com.mydemocompany.taskappV2.entity.TaskEntity;
import com.mydemocompany.taskappV2.repository.TaskRepository;
import com.mydemocompany.taskappV2.service.TaskService;
import org.springframework.stereotype.Service;
import java.util.List;

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
    public TaskEntity findById(Long id) {
        return taskRepo.findById(id).orElse(new TaskEntity());
    }

    @Override
    public TaskEntity saveTask(TaskEntity task) {
        return taskRepo.save(task);
    }

    @Override
    public TaskEntity updateTask(TaskEntity task) {
        TaskEntity oldTask = taskRepo.getReferenceById(task.getId());
        oldTask.setName(task.getName());
        return taskRepo.save(oldTask);
    }

    @Override
    public void deleteTask(Long id) {
        taskRepo.deleteById(id);

    }
}
