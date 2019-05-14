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
//@FeignClient(name="role-service", url="http://localhost:8101")
@Service
@FeignClient(name="role-service")
@RibbonClient(name="role-service")
public interface EmployeeRollService {

	@GetMapping("/role/{roleName}")
	public EmployeePayroll getEmployeeRollByRollName(@PathVariable("roleName") String roleName);
	
}
