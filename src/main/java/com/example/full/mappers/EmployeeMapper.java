package com.example.full.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.full.model.Employee;

@Mapper
public interface EmployeeMapper {
	
	@Select("select * from Employee")
	List<Employee> findAll();
	
	@Insert("insert into Employee (name, salary, eid) values (#{name}, #{salary}, #{eid})")
	void insert(Employee e);
		
	@Update("update employee set salary = #{salary} where name = #{name}")
	void update(Employee e);

	@Delete("delete from employee where name = #{name}") // not db.table
	void delete(Employee e);

}
