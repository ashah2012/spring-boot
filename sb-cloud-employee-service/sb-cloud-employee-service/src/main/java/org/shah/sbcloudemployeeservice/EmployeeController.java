/**
 * 
 */
package org.shah.sbcloudemployeeservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author avish
 *
 */

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	Environment env;

	@GetMapping("/employee/{empId}")
	public Employee getEmployeeDetails(@PathVariable Long empId) {
		// return new Employee("fistName", "lastName", "E101", new Date());
		Optional<Employee> employeeOptional = employeeRepository.findById(empId);
		Employee employee = employeeOptional.get();
		employee.setPort(Integer.valueOf(env.getProperty("local.server.port")));
		return employee;

	}

}
