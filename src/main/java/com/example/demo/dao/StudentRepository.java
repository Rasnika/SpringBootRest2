package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Student;


@RepositoryRestResource
public interface StudentRepository extends CrudRepository<Student, Long> 
{
    
}