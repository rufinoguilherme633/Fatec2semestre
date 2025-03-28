package br.edu.fateccotia.tasklist.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.fateccotia.tasklist.model.Task;

@Repository
public interface TaskRepository 
	extends CrudRepository<Task, Integer> {

}
