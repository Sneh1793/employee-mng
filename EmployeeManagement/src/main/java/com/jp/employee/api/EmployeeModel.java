/**
 * 
 */
package com.jp.employee.api;

import java.io.Serializable;

/**
 * This is a Employee Model class.
 * 
 * @author chand
 *
 */
public class EmployeeModel implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	private int employeeId;
	private String empName;
	private String designation;
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	

}
