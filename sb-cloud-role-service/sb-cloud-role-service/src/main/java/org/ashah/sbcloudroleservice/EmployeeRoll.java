/**
 * 
 */
package org.ashah.sbcloudroleservice;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author avish
 *
 */
@Entity
@Table(name="employee_roll")
public class EmployeeRoll implements Serializable{

	public EmployeeRoll() {
		
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6325397956562805285L;

	@Id
	@Column(name="role_id")
	private Long roleId;
	
	@Column(name="role_name")
	private String roleName;
	
	@Column(name="role_description")
	private String description;

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
	
	
	
}
