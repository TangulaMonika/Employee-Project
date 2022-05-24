package org.employee.controller;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpSession;

import org.employee.service.EmpService;
import org.employee.validation.Validation;
import org.manuh.domain.EmployeeDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Manuh")
public class EmployeeController {
	@Autowired
	EmpService empl;
	Logger log = Logger.getLogger(EmployeeController.class.getName());

	@GetMapping("/AddEmployee")
	public String addEmployee(String empId, ModelMap uiModel, HttpSession session, EmployeeDetails employee) {
		String user = (String) session.getAttribute("Username");
		if (user == null) {
			uiModel.addAttribute("error", "Session expired");
			return "login";
		}
		uiModel.addAttribute("empId", empId);
		return "addEmp";
	}

	@PostMapping("/AddEmployee")
	public String addEmployee(ModelMap uiModel, @ModelAttribute EmployeeDetails employee, HttpSession session) {
		String user = (String) session.getAttribute("Username");
		if (user == null) {
			uiModel.addAttribute("error", "Session expired");
			return "login";
		}
		String error = Validation.validate(employee);
		if (error != null && error.trim().length() > 0) {
			uiModel.addAttribute("employee", employee);
			uiModel.addAttribute("EmptyFileError", error);
			return "addEmp";
		}
		empl.addEmployee(employee);
		log.info("Added Employee Details");
		List<EmployeeDetails> empList = empl.getAllEmployeeDetails();
		uiModel.addAttribute("empList", empList);
		log.info("Get All Employees");
		return "getAll";
	}

	@GetMapping("/EditEmployee")
	public String editEmployee(@RequestParam("empId") String empId, Model uiModel, HttpSession session,
			EmployeeDetails employee) {
		String user = (String) session.getAttribute("Username");
		if (user == null) {
			uiModel.addAttribute("error", "Session expired");
			return "login";
		}
		EmployeeDetails emp = empl.getEmployee(Integer.parseInt(empId));
		uiModel.addAttribute("emp", emp);
		return "editEmp";
	}

	@PostMapping("/EditEmployee")
	public String editEmployee(EmployeeDetails employee, ModelMap uiModel, HttpSession session) {
		String user = (String) session.getAttribute("Username");
		if (user == null) {
			uiModel.addAttribute("error", "Session expired");
			return "login";
		}
		String error = Validation.validate(employee);
		if (error != null && error.trim().length() > 0) {
			uiModel.addAttribute("emp", employee);
			uiModel.addAttribute("EmptyFileError", error);
			return "editEmp";
		}
		empl.updateEmpRecord(employee);
		log.info("Edit Employee Details");
		List<EmployeeDetails> empList = empl.getAllEmployeeDetails();
		uiModel.addAttribute("empList", empList);
		log.info("Get All Employees");
		return "getAll";
	}

	@GetMapping("/GetAll")
	public String getAllEmployees(ModelMap uiModel, HttpSession session) {
		String user = (String) session.getAttribute("Username");
		if (user == null) {
			uiModel.addAttribute("error", "Session expired");
			return "login";
		}
		List<EmployeeDetails> empList = empl.getAllEmployeeDetails();
		uiModel.addAttribute("empList", empList);
		log.info("Get All Employees");
		return "getAll";

	}

	@GetMapping("/DeleteEmployee")
	public String deleteEmp(ModelMap uiModel, int empId, HttpSession session) {
		String user = (String) session.getAttribute("Username");
		if (user == null) {
			uiModel.addAttribute("error", "Session expired");
			return "login";
		}
		EmployeeDetails emp = empl.deleteEmployee(empId);
		log.info("Deleted Employee record with " + empId + "Employee ID");
		List<EmployeeDetails> empList = empl.getAllEmployeeDetails();
		uiModel.addAttribute("empList", empList);
		log.info("Get All Employees");
		return "getAll";

	}

	@GetMapping("/SearchEmployee")
	public String searchEmp(ModelMap uiModel, int empId, HttpSession session) {
		String user = (String) session.getAttribute("Username");
		if (user == null) {
			uiModel.addAttribute("error", "Session expired");
			return "login";
		}
		EmployeeDetails emp = empl.getEmployee(empId);
		log.info("Your search result" + emp);
		uiModel.addAttribute("SearchEmployee", emp);
		return "search";
	}

}
