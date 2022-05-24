package org.employee.controller;

import java.util.List;
import java.util.logging.Logger;

import org.employee.project.service.ProjectService;
import org.manuh.domain.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectRestController {

	@Autowired
	ProjectService pro;
	Logger log = Logger.getLogger(ProjectRestController.class.getName());

	@PostMapping("rest/AddProject")
	public List<Project> addProject(@RequestBody Project project) {
		pro.addProject(project);
		log.info("Added Project Details");
		return pro.getAllProjects();
	}

	@GetMapping("rest/GetAllPro")
	public List<Project> getAllProjects() {
		log.info("Get All Projects");
		return pro.getAllProjects();

	}

	@PutMapping("rest/EditProject")
	public List<Project> editProject(@RequestBody Project project) {
		pro.updateProject(project);
		log.info("Edit project" + project);
		return pro.getAllProjects();

	}

	@DeleteMapping("rest/DeleteProject")
	public List<Project> deleteproj(Integer pId) {
		pro.deleteProject(pId);
		log.info("Deleted Project record with " + pId + "Project ID");
		pro.getAllProjects();
		return pro.getAllProjects();

	}

	@GetMapping("rest/ViewProject")
	public List<Project> viewProject(Integer empId) {
		return pro.getNoOfEmpInaProj(empId);
	}

}
