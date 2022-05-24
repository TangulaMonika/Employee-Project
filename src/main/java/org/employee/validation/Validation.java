package org.employee.validation;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.manuh.domain.EmployeeDetails;

public class Validation {
	static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	public static String validate(EmployeeDetails employee) {
		String empFirstname = employee.getEmpFirstname();
		String empLastname = employee.getEmpLastname();
		Long phone = employee.getPhone();
		Long salary = employee.getSalary();
		String email = employee.getEmail();
		String empDesignation = employee.getEmpDesignation();
		String active = String.valueOf(employee.isActive());
		LocalDate dateOfJoin = employee.getDateOfJoin();
		LocalDate dateOfRelieving = employee.getDateOfRelieving();
		String error = "";
		if (empFirstname == null || empFirstname.trim().length() == 0) {
			error = "Employee First name should not be empty";
		} else if (empLastname == null || empLastname.trim().length() == 0) {
			error = "Employee Last name should not be empty";
		} else if (phone == null || phone.toString().trim().length() == 0 ) {
			error = "Phone should not be empty";
		} else if (salary == null || salary.toString().trim().length() == 0  ) {
			error = "Salary should not be empty";
		} else if (email == null || email.trim().length() == 0) {
			error = "email should not be empty";
		} else if (empDesignation == null || empDesignation.trim().length() == 0) {
			error = "Employee Designation should not be empty";
		} else if (active == null || active.trim().length() == 0) {
			error = "Active should not be empty";
		} 
		else if (dateOfJoin == null || dateOfJoin.toString().trim().length() == 0) {
			error = "dateOfJoin should not be empty";
		} else if (dateOfRelieving == null || dateOfRelieving.toString().trim().length() == 0) {
			error = "dateOFRelieving should not be empty";
		}
		if (dateOfJoin != null && dateOfJoin.toString().length() > 0) {
			try {
				LocalDate.parse(dateOfJoin.toString(), dtf);
			} catch (Exception e) {
				error = String.format("Invalid dateOfJoin.error:%s", e.getMessage());
			}
			return error;
		}
		if (dateOfRelieving != null && dateOfRelieving.toString().length() > 0) {
			try {
				LocalDate.parse(dateOfRelieving.toString(),dtf);
			} catch (Exception e) {
				error = String.format("Invalid dateOfRelieving.error:%s", e.getMessage());
			}
			return error;
		}
		return error;
		
	}
}

