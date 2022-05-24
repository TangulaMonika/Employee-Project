package org.employee.service;

import java.util.List;

import org.employee.util.JdbcUtil;
import org.manuh.domain.EmployeeDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeJdbcServiceImpl implements EmpService {
	@Autowired
	JdbcUtil util = new JdbcUtil();

	@Override
	public EmployeeDetails getEmployee(int empId) {
		// TODO Auto-generated method stub
		return util.getEmployee(empId);
	}

	@Override
	public int addEmployee(EmployeeDetails employee) {
		// TODO Auto-generated method stub
		try {
			if(employee.getEmpFirstname().isEmpty() || employee.getEmpFirstname().length() == 0) {
				throw new Exception("");
			}
		} catch(Exception e) {
			e.getMessage();
		}
		return util.addEmployee(employee);
	}

	@Override
	public List<EmployeeDetails> getAllEmployeeDetails() {
		// TODO Auto-generated method stub
		return util.getAllEmployees();
	}

	@Override
	public EmployeeDetails deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		util.deleteEmployee(empId);
		return null;
	}

	@Override
	public int topnEmployee(int topn) {
		// TODO Auto-generated method stub
		return util.topnEmployee(topn);
	}

	@Override
	public int updateEmpRecord(EmployeeDetails employee) {
		// TODO Auto-generated method stub
		return util.updatempRecord(employee);
	}

	@Override
	public List<EmployeeDetails> sortBysalary() {
		// TODO Auto-generated method stub
		return util.sortBysalary();
	}

}
