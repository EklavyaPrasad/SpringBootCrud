package com.cisco.SpringBootCrud.repository;

import org.springframework.data.repository.CrudRepository;

import com.cisco.SpringBootCrud.bean.Subject;

public interface SubjectRepository extends CrudRepository<Subject, String>{
	
}
