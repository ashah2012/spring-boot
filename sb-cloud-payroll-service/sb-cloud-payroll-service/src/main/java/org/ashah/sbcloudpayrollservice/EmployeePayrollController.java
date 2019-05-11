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
	
	@PostMapping("/employee/{empId}/role/{roleName}")
	public void insertEmployeePayroll(@PathVariable Long empId, @PathVariable String roleName) {
		
		ResponseEntity<EmployeePayroll> forEntityEmployee = new RestTemplate().getForEntity("http://localhost:8080/employee/{empId}", EmployeePayroll.class, empId);
		EmployeePayroll employeePayroll = employeeService.getEmployeeDetails(empId);
		/*
		 * ResponseEntity<EmployeePayroll> forEntityRole = new
		 * RestTemplate().getForEntity("http://localhost:8101/role/{roleName}",
		 * EmployeePayroll.class, roleName);
		 * 
		 * employeePayroll.setRoleId(forEntityRole.getBody().getRoleId());
		 * employeePayroll.setRoleName(forEntityRole.getBody().getRoleName());
		 * employeePayroll.setDescription(forEntityRole.getBody().getDescription());
		 */
		
		System.out.println("Feign check ..... " + employeePayroll.getFirstName());
		employeePayrollRepo.save(employeePayroll);
		System.out.println("Method called ...........");
	}
	
}
