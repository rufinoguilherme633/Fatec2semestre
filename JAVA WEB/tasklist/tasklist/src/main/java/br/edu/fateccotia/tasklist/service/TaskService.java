package br.edu.fateccotia.tasklist.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.fateccotia.tasklist.model.Task;
import br.edu.fateccotia.tasklist.repository.TaskRepository;

@Service
public class TaskService {
	@Autowired
	private TaskRepository taskRepository;

	public Task save(Task task) {
		return taskRepository.save(task);
	}
	
	public List<Task> findAll() {
		List<Task> list = new ArrayList<Task>();
		taskRepository.findAll()
					  .iterator()
					  .forEachRemaining(list::add);
		return list;
	}

}
