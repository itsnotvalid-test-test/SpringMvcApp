package com.spring.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.model.Employee;

@Controller
@RequestMapping(value = "/emp")
public class EmployeeController {

	// http://localhost:8080/emp/update

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public String showEmpDetails() {

		return null;
	}

	// http://localhost:8080/emp/save
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveEmployee(Employee emp) {
		// insert into employee 
		return null;
	}

	// http://localhost:8080/emp/delete
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public String deleteEmployee() {

		return null;
	}

	// http://localhost:8080/emp/retrive
	@RequestMapping(value = "/retrive", method = RequestMethod.GET)
	public String getEmployee(Integer id) {
		
		// select * from employee where empId=id;
		return null;
	}
}
