/**
 * 
 */
package org.shah.sbcloudemployeeservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author avish
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
