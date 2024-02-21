package com.cisco.SpringBootCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.cisco.SpringBootCrud.bean.Subject;
import com.cisco.SpringBootCrud.service.SubjectService;

@RestController
public class SubjectController {
	
	@Autowired
	private SubjectService subjectService;
	
	@GetMapping("/subjects")
	public List<Subject> getAllSubjects() {
		return subjectService.getAllSubjects();
	}
	
	@PostMapping("/subject")
	public String addSubject(@RequestBody Subject subject) {
		return subjectService.addSubject(subject);
	}
	
	@PutMapping("/subject/{id}")
    public String updateSubject(@PathVariable String id,@RequestBody Subject subject) {
        return subjectService.updateSubject(id, subject);
    }
	
	@DeleteMapping("/subject/{id}")
	public String deleteSubject(@PathVariable String id) {
        return subjectService.deleteSubject(id);
    }
	
	
}
