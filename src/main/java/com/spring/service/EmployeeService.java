package com.spring.service;

import java.util.List;
import com.spring.model.Employee;

public interface EmployeeService {
	
	//CURD
	
	public List<Employee> getEmployeeDetails();
	
	public void saveEmployee(Employee employee);
	
	public void updateEmployee(Employee employee);
	
	public Employee getEmployee(Integer empId);
	
	public void deleteEmployee(Integer empId);

}
