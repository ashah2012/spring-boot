/**
 * 
 */
package org.ashah.sbcloudroleservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author avish
 *
 */
@Repository
public interface EmployeeRollRepository extends JpaRepository<EmployeeRoll, Long> {

	
	public EmployeeRoll findEmployeeRollByRoleName(String roleName);
}
