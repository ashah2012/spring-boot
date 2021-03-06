/**
 * 
 */
package org.ashah.sbcloudpayrollservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author avish
 *
 */
@Service
//@FeignClient(name="employee-service", url = "localhost:8080")
@FeignClient(name="employee-service")
@RibbonClient(name="employee-service")
public interface EmployeeService {

	@GetMapping("/employee/{empId}")
	public EmployeePayroll getEmployeeDetails(@PathVariable Long empId) ;
	
}
