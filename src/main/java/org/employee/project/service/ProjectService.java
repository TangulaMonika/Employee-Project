package org.employee.project.service;

import java.util.LinkedList;
import java.util.List;

import org.manuh.domain.EmployeeDetails;
import org.manuh.domain.Project;
import org.springframework.beans.factory.annotation.Autowired;

public interface ProjectService {
	public int addProject(Project projectDetails);
	
	public List<Project> getAllProjects();
	
	public List<Project> getNoOfEmpInaProj(int empId);
	
	public int updateProject(Project project);
	
	public Project deleteProject(int empId);
	
	public Project getProject(int pId);

}
