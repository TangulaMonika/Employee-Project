package org.employee.project.util;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.employee.util.JdbcUtil;
import org.manuh.domain.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProjJdbcUtil {
	Logger log = Logger.getLogger(JdbcUtil.class.getName());
	@Autowired
	JdbcTemplate jdbc;

	public int addProject(Project projectDetails) {
		String sql = "insert into Project(empId,pName,startDate,dueDate,projectManager) values (?,?,?,?,?)";
		log.info(("Inserted Record:" + projectDetails.getEmpId()));
		return jdbc.update(sql, projectDetails.getEmpId(), projectDetails.getpName(), projectDetails.getStartDate(),
				projectDetails.getDueDate(), projectDetails.getprojectManager());

	}

	public List<Project> getAllProjects() {
		List<Project> proj = new ArrayList<>();
		String sql = "select * from project;";
		proj = jdbc.query(sql, (rs, rowNum) -> new Project(rs.getInt("empId"), rs.getInt("pId"), rs.getString("pName"),
				rs.getDate("startDate"), rs.getDate("dueDate"), rs.getString("projectManager")));
		return proj;

	}

	public int updateProject(Project project) {
		return jdbc.update("update project set empid=?,pName=?, startDate=?,dueDate=?,projectManager=? where pId=?",
				new Object[] { project.getEmpId(), project.getpName(), project.getStartDate(), project.getDueDate(),
						project.getprojectManager(), project.getpId()

				});

	}

	public List<Project> getNoOfEmpInaProj(int empId) {
		List<Project> proj = new ArrayList<>();
		String sql = "select * from project where empId = ?";
		Object[] args = { empId };
		proj = jdbc.query(sql, args, (rs, rowNum) -> new Project(rs.getInt("empId"), rs.getInt("pId"),
				rs.getString("pName"), rs.getDate("startDate"), rs.getDate("dueDate"), rs.getString("projectManager")));
		return proj;

	}

	public Project getProject(int pId) {
		String sql = "select * from project where pId = ?";
		Object[] args = { pId };
		Project pro = jdbc.queryForObject(sql, args, BeanPropertyRowMapper.newInstance(Project.class));
		return pro;

	}

	public Project deleteProject(int pId) {
		jdbc.update("delete from project where pId = ?", pId);
		return null;

	}
}