package com.cisco.SpringBootCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cisco.SpringBootCrud.bean.Subject;
import com.cisco.SpringBootCrud.repository.SubjectRepository;

@Service
public class SubjectService {
	
	@Autowired
	SubjectRepository subjectRepo;
	
	public List<Subject> getAllSubjects() {
		List<Subject> subjectsList= new ArrayList<>();
		subjectRepo.findAll().forEach(subjectsList::add);
		return subjectsList;
	}
	
	public String addSubject(Subject subject) {
		subjectRepo.save(subject);
		return subject.getName() + " Added successfully";
		
	}
	
	public String updateSubject(String id,Subject subject) {
		subjectRepo.save(subject);
		return subject.getName() + " Updated successfully";
	}
	
	public String deleteSubject(String id) {
		subjectRepo.deleteById(id);
		return id + " Deleted successfully"; 
	}
}
