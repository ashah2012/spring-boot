/**
 * 
 */
package org.ashah.sbcloudpayrollservice;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author avish
 *
 */
@Entity
public class EmployeePayroll implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3748846525521274644L;

	public EmployeePayroll() {}
	
	
	
	public EmployeePayroll(Long payrollId, String firstName, String lastName, Long empId, Long roleId, String roleName,
			String description) {
		super();
		this.payrollId = payrollId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.empId = empId;
		this.roleId = roleId;
		this.roleName = roleName;
		this.description = description;
	}



	@Id
	@GeneratedValue
	@Column(name="payroll_id")
	private Long payrollId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="emp_id")
	private Long empId;
	
	@Column(name="role_id")
	private Long roleId;
	
	@Column(name="role_name")
	private String roleName;
	
	@Column(name="role_description")
	private String description;

	public Long getPayrollId() {
		return payrollId;
	}



	public void setPayrollId(Long payrollId) {
		this.payrollId = payrollId;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public Long getEmpId() {
		return empId;
	}



	public void setEmpId(Long empId) {
		this.empId = empId;
	}



	public Long getRoleId() {
		return roleId;
	}



	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}



	public String getRoleName() {
		return roleName;
	}



	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	
	
}
