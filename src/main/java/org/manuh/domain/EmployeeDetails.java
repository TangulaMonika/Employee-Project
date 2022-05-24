package org.manuh.domain;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class EmployeeDetails {
	private Integer empId;
	private String empFirstname;
	private String empLastname;
	private Long phone;
	private Long salary;
	private String email;
	// private Date dob;
	private String empDesignation;
	private boolean active = true;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateOfJoin;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateOfRelieving;

	public EmployeeDetails(Integer empId, String empFirstname, String empLastname, Long phone, Long salary,
			String email, String empDesignation, boolean active, LocalDate dateOfJoin, LocalDate dateOfRelieving) {
		super();
		this.empId = empId;
		this.empFirstname = empFirstname;
		this.empLastname = empLastname;
		this.phone = phone;
		this.salary = salary;
		this.email = email;
		this.empDesignation = empDesignation;
		this.active = active;
		this.dateOfJoin = dateOfJoin;
		this.dateOfRelieving = dateOfRelieving;
	}

	public EmployeeDetails() {
		super();
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpFirstname() {
		return empFirstname;
	}

	public void setEmpFirstname(String empFirstname) {
		this.empFirstname = empFirstname;
	}

	public String getEmpLastname() {
		return empLastname;
	}

	public void setEmpLastname(String empLastname) {
		this.empLastname = empLastname;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public LocalDate getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(LocalDate dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

	public LocalDate getDateOfRelieving() {
		return dateOfRelieving;
	}

	public void setDateOfRelieving(LocalDate dateOfRelieving) {
		this.dateOfRelieving = dateOfRelieving;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [empId=" + empId + ", empFirstname=" + empFirstname + ", empLastname=" + empLastname
				+ ", phone=" + phone + ", salary=" + salary + ", email=" + email + ", empDesignation=" + empDesignation
				+ ", active=" + active + ", dateOfJoin=" + dateOfJoin + ", dateofrelieving=" + dateOfRelieving + "]";
	}

}