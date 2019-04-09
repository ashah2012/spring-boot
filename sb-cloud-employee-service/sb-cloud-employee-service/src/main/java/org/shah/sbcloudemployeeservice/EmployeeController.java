/**
 * 
 */
package org.shah.sbcloudemployeeservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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

	@GetMapping("/employee/{empId}")
	public Employee getEmployeeDetails(@PathVariable Long empId) {
		// return new Employee("fistName", "lastName", "E101", new Date());
		Optional<Employee> employee = employeeRepository.findById(empId);
		return employee.get();

	}

}
