package org.employee.project.service;

import java.util.LinkedList;
import java.util.List;

import org.employee.project.util.ProjJdbcUtil;
import org.manuh.domain.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProjJdbcServiceImpl implements ProjectService {
	@Autowired
	ProjJdbcUtil util;

	@Override
	public int addProject(Project projectDetails) {
		// TODO Auto-generated method stub

		return util.addProject(projectDetails);
	}

	public List<Project> getAllProjects() {
		// TODO Auto-generated method stub
		return util.getAllProjects();
	}

	@Override
	public List<Project> getNoOfEmpInaProj(int empId) {
		// TODO Auto-generated method stub
		return util.getNoOfEmpInaProj(empId);
	}

	@Override
	public int updateProject(Project project) {
		// TODO Auto-generated method stub
		return util.updateProject(project);
	}

	@Override
	public Project deleteProject(int pId) {
		// TODO Auto-generated method stub
		return util.deleteProject(pId);
	}

	@Override
	public Project getProject(int pId) {
		// TODO Auto-generated method stub
		return util.getProject(pId);
	}

}