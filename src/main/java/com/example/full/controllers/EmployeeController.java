package com.example.full.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.full.mappers.EmployeeMapper;
import com.example.full.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	private EmployeeMapper mapper;
	EmployeeController(EmployeeMapper mapper){
		this.mapper = mapper;
	}
	
	@GetMapping("/all")
	public List<Employee> showAll(){
		return mapper.findAll();
	}
	
	@GetMapping("/insert")
	public List<Employee> insert(){
		Employee newEmployee = new Employee();
		newEmployee.setName("aditi1");
		newEmployee.setSalary(40000);
		newEmployee.setEid(101);
		
		mapper.insert(newEmployee);
		return mapper.findAll();
	}
	
	@GetMapping("/update")
	public List<Employee> update(){
		Employee newEmployee = new Employee();
		newEmployee.setName("aditi1");
		newEmployee.setSalary(60000);
		
		mapper.update(newEmployee);
		return mapper.findAll();
	}
	
	@GetMapping("/delete")
	public List<Employee> delete(){
		Employee newEmployee = new Employee();
		newEmployee.setName("aditi1");
		
		mapper.delete(newEmployee);
		return mapper.findAll();
	}
}
