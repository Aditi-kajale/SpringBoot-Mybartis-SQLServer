package com.example.full;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.full.model.Employee;

@MappedTypes(Employee.class)
@MapperScan("com.example.full.mappers")
@SpringBootApplication
public class FullApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullApplication.class, args);
	}

}
