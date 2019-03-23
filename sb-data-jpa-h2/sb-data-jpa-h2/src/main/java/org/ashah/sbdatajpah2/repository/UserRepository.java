package org.ashah.sbdatajpah2.repository;

import org.ashah.sbdatajpah2.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
