package com.mostafa.sna.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.mostafa.sna.entity.Student;

@RepositoryRestResource(path = "learner")
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
}
