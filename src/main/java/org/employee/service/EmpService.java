package org.employee.service;

import java.util.List;

import org.manuh.domain.EmployeeDetails;
import org.springframework.beans.factory.annotation.Autowired;

public interface EmpService {
	@Autowired
	public EmployeeDetails getEmployee(int empId);

	public int addEmployee(EmployeeDetails employee);

	public List<EmployeeDetails> getAllEmployeeDetails();

	public EmployeeDetails deleteEmployee(int empId);

	public int topnEmployee(int topn);

	public int updateEmpRecord(EmployeeDetails employee);

	public List<EmployeeDetails> sortBysalary();

}
