package org.employee.controller;

import java.util.List;
import java.util.logging.Logger;

import org.employee.service.EmpService;
import org.manuh.domain.EmployeeDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRestController {
	@Autowired
	EmpService empl;
	Logger log = Logger.getLogger(EmployeeRestController.class.getName());

	@GetMapping("rest/GetAll")
	public List<EmployeeDetails> getAllEmployees() {
		return empl.getAllEmployeeDetails();
	}
	
	@PostMapping("rest/AddEmployee")
	public List<EmployeeDetails> addEmployee(@RequestBody EmployeeDetails employee) {
		empl.addEmployee(employee);
		log.info("Added Employee Details");
		return empl.getAllEmployeeDetails();
	}
	
	@PutMapping("rest/EditEmployee")
	public List<EmployeeDetails> editEmployee(@RequestBody EmployeeDetails employee) {
		empl.updateEmpRecord(employee);
		log.info("Get All Employees");
		return empl.getAllEmployeeDetails();
	}
	
	@DeleteMapping("rest/DeleteEmployee")
	public List<EmployeeDetails> deleteEmp(Integer empId) {
		empl.deleteEmployee(empId);
		log.info("Deleted Employee record with " + empId + "Employee ID");
		return empl.getAllEmployeeDetails();

	}
	
	@GetMapping("rest/SearchEmployee")
	public EmployeeDetails searchEmp(Integer empId) {
		log.info("Your search result");
		return empl.getEmployee(empId);
	}
}
