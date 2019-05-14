/**
 * 
 */
package org.ashah.sbcloudpayrollservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author avish
 *
 */
@RestController
public class EmployeePayrollController {

	@Autowired
	EmployeePayrollRepository employeePayrollRepo;
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	EmployeeRollService rollService;
	
	@PostMapping("/employee/{empId}/role/{roleName}")
	public EmployeePayroll insertEmployeePayroll(@PathVariable Long empId, @PathVariable String roleName) {
		
		EmployeePayroll employee = employeeService.getEmployeeDetails(empId);
		
		EmployeePayroll role = rollService.getEmployeeRollByRollName(roleName);
		
		employee.setRoleId(role.getRoleId());
		employee.setRoleName(role.getRoleName());
		employee.setDescription(role.getDescription());
		
		employeePayrollRepo.save(employee);
		
		return employee;
	}
	
}
