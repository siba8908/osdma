package com.sunjray.osdma.PMmodel;
// Generated Aug 15, 2019 11:10:19 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TOsMasterDepartment generated by hbm2java
 */
@Entity
@Table(name = "t_os_master_department", catalog = "osdma")
public class MasterDepartment implements java.io.Serializable {

	private Integer departmentId;
	private String departmentName;

	public MasterDepartment() {
	}

	public MasterDepartment(String departmentName) {
		this.departmentName = departmentName;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "department_id", unique = true, nullable = false)
	public Integer getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	@Column(name = "department_name", length = 45)
	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}
