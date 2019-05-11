/**
 * 
 */
package org.ashah.sbcloudroleservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author avish
 *
 */
@RestController
public class EmployeeRollController {

	@Autowired
	EmployeeRollRepository  employeeRollRepository;
	
	@GetMapping("/role/{roleName}")
	public EmployeeRoll getEmployeeRollByRollName(@PathVariable String roleName) {
		return employeeRollRepository.findEmployeeRollByRoleName(roleName);
	}
}
