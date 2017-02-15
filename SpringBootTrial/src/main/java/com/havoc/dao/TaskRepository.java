package com.havoc.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.havoc.entity.Task;

public interface TaskRepository extends CrudRepository<Task, Integer>{

	public List<Task> findAll();

}
