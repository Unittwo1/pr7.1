package com.example.mobiles4.Data.DataSources;

import com.example.mobiles4.Data.Models.Task;
import com.example.mobiles4.Data.Repositories.TaskListRepository;

import java.util.ArrayList;
import java.util.List;

public class UserTaskList implements TaskListRepository {
    private List<Task> tasks;
    public UserTaskList() {
        tasks = new ArrayList<>();
    }
    @Override
    public List<Task> getTasks() {
        return tasks;
    }
    @Override
    public Task get(int index) {
        return tasks.get(index);
    }
    @Override
    public void add(Task task) {
        tasks.add(task);
    }

    @Override
    public void clearAll() {
        tasks.clear();
    }

    @Override
    public boolean isEmpty() {
        return tasks.isEmpty();
    }
    @Override
    public int getSize() {
        return tasks.size();
    }
}
