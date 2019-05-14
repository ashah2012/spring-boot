/**
 * 
 */
package org.ashah.sbdatarest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author avish
 *
 */
@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface WebsiteUserRepository extends JpaRepository<WebsiteUsers, Long> {

}
