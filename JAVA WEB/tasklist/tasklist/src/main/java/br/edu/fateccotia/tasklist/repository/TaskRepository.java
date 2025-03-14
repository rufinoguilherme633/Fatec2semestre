package br.edu.fateccotia.tasklist.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.fateccotia.tasklist.model.Task;

public interface TaskRepository extends CrudRepository<Task, Integer> {

}
