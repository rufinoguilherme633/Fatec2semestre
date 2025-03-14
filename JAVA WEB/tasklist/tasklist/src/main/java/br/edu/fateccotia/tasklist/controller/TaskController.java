package br.edu.fateccotia.tasklist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fateccotia.tasklist.model.Task;
import br.edu.fateccotia.tasklist.service.TaskService;

@RestController
@RequestMapping("/task")
public class TaskController {
	@Autowired
	private TaskService taskService;
	//@GetMapping
	//public String find() {
		//return "Hello Word";
	//}
	@PostMapping
	public ResponseEntity<Task> create(@RequestBody Task task){
		Task save = taskService.save(task);
		
		return ResponseEntity.ok(save);
		
	}
	
	@GetMapping
	public ResponseEntity<List<Task>> findall(){
		List<Task> list = taskService.findall();
		return ResponseEntity.ok(list);
	}
}
