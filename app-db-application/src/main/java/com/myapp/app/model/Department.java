package com.myapp.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Department extends DateAudit{

	
	private static final long serialVersionUID = -7301330450213244472L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "department_code")
	private String depatmentCode;
	
	@Column(name = "dept_name")
	private String deptName;
	
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "departmentId")
	private Employee employee;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getDepatmentCode() {
		return depatmentCode;
	}


	public void setDepatmentCode(String depatmentCode) {
		this.depatmentCode = depatmentCode;
	}


	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	
}
