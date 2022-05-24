package org.manuh.domain;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

public class Project {

	private Integer empId;
	private Integer pId;
	@NotEmpty
	private String pName;
	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date startDate;
	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dueDate;
	@NotBlank(message = "Must not be empty")
	private String projectManager;

	public Project(Integer empId, Integer pId, String pName, Date startDate, Date dueDate,
			String projectManager) {
		super();
		this.empId = empId;
		this.pId = pId;
		this.pName = pName;
		this.startDate = startDate;
		this.dueDate = dueDate;
		this.projectManager = projectManager;
	}

	public Project() {

	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getprojectManager() {
		return projectManager;
	}

	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}

	@Override
	public String toString() {
		return "Project [empId=" + empId + ", pId=" + pId + ", pName=" + pName + ", startDate=" + startDate
				+ ", dueDate=" + dueDate + ", projectManager=" + projectManager + "]";
	}

}
