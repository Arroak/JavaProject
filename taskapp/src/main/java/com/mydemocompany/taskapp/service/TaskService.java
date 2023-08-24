package com.mydemocompany.taskapp.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class TaskService {
    private final List<String> taskList = new ArrayList<>();
    public  String addTask(String task){
        taskList.add(task);
        return task+" successfully added to task list";
    }
    public  String deleteTask(String task){
        int task_index  = -1;
       for (int ind = 0; ind < taskList.size(); ind ++ ){
           System.out.println("current task is "+taskList.get(ind));
           if (task.equals(taskList.get(ind))){
               task_index = ind;
               break;
           }

       }
        if (task_index > -1) {
            taskList.remove(task_index);
            return "successful";
        }
        else return "task does not exist";

    }
    public  List<String> fetchAllTask(){
        return taskList;
    }
}
