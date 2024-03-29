package com.sunjray.osdma.PMmodel;
// Generated Aug 15, 2019 11:10:19 AM by Hibernate Tools 4.3.5.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sunjray.osdma.PCmodel.EmployeePersonalDetails;

/**
 * TOsHrEmpAddEmployee generated by hbm2java
 */
@Entity
@Table(name = "t_os_hr_emp_add_employee", catalog = "osdma")
public class HrEmpAddEmployee implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer addEmpId;
	private MasterDesignation masterDesignation;
	private Float salary;
	private MasterDepartment masterDepartment;
	private Date joiningDate;
	private Date createdDate;
	private String employeeCode;
	private EmployeePersonalDetails employeePersonalDetails;

	public HrEmpAddEmployee() {
	}

	public HrEmpAddEmployee(MasterDesignation masterDesignation, Float salary, MasterDepartment masterDepartment, Date joiningDate,
			Date createdDate, String employeeCode, EmployeePersonalDetails employeePersonalDetails) {
		this.masterDesignation = masterDesignation;
		this.salary = salary;
		this.masterDepartment = masterDepartment;
		this.joiningDate = joiningDate;
		this.createdDate = createdDate;
		this.employeeCode = employeeCode;
		this.employeePersonalDetails = employeePersonalDetails;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "add_emp_id", unique = true, nullable = false)
	public Integer getAddEmpId() {
		return this.addEmpId;
	}

	public void setAddEmpId(Integer addEmpId) {
		this.addEmpId = addEmpId;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "designation_id")
	public MasterDesignation getMasterDesignation() {
		return masterDesignation;
	}

	public void setMasterDesignation(MasterDesignation masterDesignation) {
		this.masterDesignation = masterDesignation;
	}

	@Column(name = "salary", precision = 10)
	public Float getSalary() {
		return this.salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "department_id")
	public MasterDepartment getMasterDepartment() {
		return masterDepartment;
	}

	public void setMasterDepartment(MasterDepartment masterDepartment) {
		this.masterDepartment = masterDepartment;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "joining_date", length = 10)
	public Date getJoiningDate() {
		return this.joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", length = 19)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "employee_code", length = 100)
	public String getEmployeeCode() {
		return this.employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_id")
	@JsonIgnoreProperties("hrEmpAddEmployee")
	public EmployeePersonalDetails getEmployeePersonalDetails() {
		return employeePersonalDetails;
	}

	public void setEmployeePersonalDetails(EmployeePersonalDetails employeePersonalDetails) {
		this.employeePersonalDetails = employeePersonalDetails;
	}

}
