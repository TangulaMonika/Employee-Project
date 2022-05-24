package org.employee.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.manuh.domain.EmployeeDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JdbcUtil {
	Logger log = Logger.getLogger(JdbcUtil.class.getName());
	@Autowired
	JdbcTemplate template;

	public int addEmployee(EmployeeDetails employee) {
		// TODO Auto-generated method stub
		log.info("Inserted Record:" + employee.getEmpId());
		String query = "insert into employee(empFirstname,empLastname,phone,salary,email,empDesignation,active,dateOfJoin,dateOfRelieving) values (?,?,?,?,?,?,?,?,?)";
		return template.update(query, employee.getEmpFirstname(), employee.getEmpLastname(), employee.getPhone(),
				employee.getSalary(), employee.getEmail(), employee.getEmpDesignation(), employee.isActive(),
				employee.getDateOfJoin(), employee.getDateOfRelieving());
	}

	public EmployeeDetails getEmployee(int empId) {
			String sql = "select * from employee where empId = ?";
			Object[] args = {empId};
			EmployeeDetails emp = template.queryForObject(sql, BeanPropertyRowMapper.newInstance(EmployeeDetails.class), args);
			
			return emp;
	}

	public EmployeeDetails deleteEmployee(int empId) {

		 template.update("delete from employee where empId = ?", empId);
		return null;
	}

	public List<EmployeeDetails> getAllEmployees() {
		List<EmployeeDetails> empList = new ArrayList<EmployeeDetails>();

		String sql = "select * from employee";
		template.execute(sql);
		empList = template.query(sql,
				(rs, rowNum) -> new EmployeeDetails(rs.getInt("empId"), rs.getString("empFirstname"),
						rs.getString("empLastname"), rs.getLong("phone"), rs.getLong("salary"), rs.getString("email"),
						rs.getString("empDesignation"), rs.getBoolean("active"), rs.getDate("dateOfJoin").toLocalDate(),
						rs.getDate("dateOfRelieving").toLocalDate()));
		return empList;
	}

	public int topnEmployee(int topn) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updatempRecord(EmployeeDetails employee) {
		// TODO Auto-generated method stub
		return template.update("update employee set empFirstname=?,empLastname=?,phone=?,salary=?,"
				+ "email=?,empDesignation=?,active=?,dateOfJoin=?,dateOfRelieving=? where empId=?", new Object[] {
	                employee.getEmpFirstname(), employee.getEmpLastname(), employee.getPhone(), employee.getSalary(),
	                employee.getEmail(),employee.getEmpDesignation(), employee.isActive(), employee.getDateOfJoin(),employee.getDateOfRelieving(),employee.getEmpId()
	
	});
	}

	public List<EmployeeDetails> sortBysalary() {
		// TODO Auto-generated method stub
		return null;
	}

	public List joins() {
		// TODO Auto-generated method stub
		return null;
	}
	}

