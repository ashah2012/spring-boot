/**
 * 
 */
package org.ashah.sbcloudpayrollservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author avish
 *
 */
@Repository
public interface EmployeePayrollRepository extends JpaRepository<EmployeePayroll, Long> {

	
}
