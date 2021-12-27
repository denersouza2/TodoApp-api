package io.github.denersouza.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.denersouza.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

	
	
}
