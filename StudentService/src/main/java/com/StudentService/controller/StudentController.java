package com.StudentService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.StudentService.entity.StudentService;
import com.StudentService.repository.StudentRepository;

@RestController
public class StudentController<Student> {
	
	@Autowired
	StudentRepository repo;
	
	@PostMapping("/Student")
	public StudentService addStudent (@RequestBody StudentService S)
	{
		return repo.save(S);
	}
	
	@GetMapping("/Student")
	public List<StudentService> getStudents()
	{
		return repo.findAll();
	}
	
	@GetMapping("/Student/{regid}")
	public StudentService getStudentById(@PathVariable Integer regid)
	{
		return repo.findById(regid).get();
	}
	
	@DeleteMapping("/Student/{regid}")
	public void delelteStudent(@PathVariable Integer regid)
	{
		repo.deleteById(regid);
	 }
	
	@PutMapping("/Student/{regid}")
	public  Student updateStudent(@PathVariable Integer regid, @RequestBody Student S)
	{
		return repo.saveAll(S);
		
	}
	

}
