package org.employee.controller;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.employee.project.service.ProjectService;
import org.manuh.domain.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Manuh")
public class ProjectController {
	@Autowired
	ProjectService pro;
	Logger log = Logger.getLogger(ProjectController.class.getName());

	@GetMapping("/AddProject")
	public String addProject(String empId,Project proj, ModelMap uiModel, HttpSession session) {
		String user = (String) session.getAttribute("Username");
		if (user == null) {
			uiModel.addAttribute("error", "Session expired");
			return "login";
		}
		uiModel.addAttribute("empId", empId);
		uiModel.addAttribute("project", proj);
		return "addProject";
	}

	@PostMapping("/AddProject")
	public String addProject(@Valid @ModelAttribute("project") Project project, BindingResult error, ModelMap uiModel,
			HttpSession session) {
		String user = (String) session.getAttribute("Username");
		if (user == null) {
			uiModel.addAttribute("error", "Session expired");
			return "login";
		}
		if (error.hasErrors()) {
			log.info("Error!!");
			return "addProject";
		}
		pro.addProject(project);
		log.info("Added Project Details");
		List<Project> projList = pro.getAllProjects();
		uiModel.addAttribute("projList", projList);
		log.info("Get All Projects");
		return "GetAllProj";
	}

	@GetMapping("/GetAllPro")
	public String getAllProjects(ModelMap uiModel, HttpSession session) {
		String user = (String) session.getAttribute("Username");
		if (user == null) {
			uiModel.addAttribute("error", "Session expired");
			return "login";
		}
		List<Project> projList = pro.getAllProjects();
		uiModel.addAttribute("projList", projList);
		log.info("Get All Projects");
		return "GetAllProj";

	}

	@GetMapping("/EditProject")
	public String editProject(ModelMap uiModel, String pId, HttpSession session) {
		String user = (String) session.getAttribute("Username");
		if (user == null) {
			uiModel.addAttribute("error", "Session expired");
			return "login";
		}
		Project proj = pro.getProject(Integer.parseInt(pId));
		log.info("Old Project Record:" + proj);
		uiModel.addAttribute("project", proj);
		return "editProj";

	}

	@PostMapping("/EditProject")
	public String editProject(@Valid @ModelAttribute("project") Project project, BindingResult error, ModelMap uiModel,
			HttpSession session) {
		String user = (String) session.getAttribute("Username");
		if (user == null) {
			uiModel.addAttribute("error", "Session expired");
			return "login";
		}
		if (error.hasErrors()) {
			log.info("Error!!");
			return "editProj";
		}
		pro.updateProject(project);
		log.info("Edit project" + project);
		List<Project> projList = pro.getAllProjects();
		uiModel.addAttribute("projList", projList);
		log.info("Get All Projects");
		return "GetAllProj";

	}

	@GetMapping("/DeleteProject")
	public String deleteproj(ModelMap uiModel, int pId, HttpSession session) {
		String user = (String) session.getAttribute("Username");
		if (user == null) {
			uiModel.addAttribute("error", "Session expired");
			return "login";
		}
		Project proj = pro.deleteProject(pId);
		log.info("Deleted Project record with " + pId + "Project ID");
		List<Project> projList = pro.getAllProjects();
		uiModel.addAttribute("projList", projList);
		log.info("Get All Projects");
		return "GetAllProj";

	}

	@GetMapping("/ViewProject")
	public String viewProject(int empId, ModelMap uiModel, HttpSession session) {
		String user = (String) session.getAttribute("Username");
		if (user == null) {
			uiModel.addAttribute("error", "Session expired");
			return "login";
		}
		List<Project> projList = pro.getNoOfEmpInaProj(empId);
		log.info("Old Project Record:" + projList);
		uiModel.addAttribute("projList", projList);
		return "GetAllProj";

	}

}
