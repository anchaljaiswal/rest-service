package io.anchal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.anchal.model.Employee;
import io.anchal.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	 EmployeeRepository employeeRepository;
	 
	 public List<Employee> retrieveEmployees() {
	  List<Employee> employees = (List<Employee>) employeeRepository.findAll();
	  return employees;
	 }
	  
	 public Employee getEmployee(Long employeeId) {
	  Optional<Employee> optEmp = employeeRepository.findById(employeeId);
	  return optEmp.get();
	 }
	  
	 public void saveEmployee(Employee employee){
	  employeeRepository.save(employee);
	 }
	  
	 public void deleteEmployee(Long employeeId){
	  employeeRepository.deleteById(employeeId);
	 }
	  
	 public void updateEmployee(Employee employee) {
	  employeeRepository.save(employee);
	 }
	

}
