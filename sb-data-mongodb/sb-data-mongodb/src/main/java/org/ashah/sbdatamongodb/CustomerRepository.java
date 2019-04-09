package org.ashah.sbdatamongodb;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {

	// spring data creates queries for the methods
	public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);
	
}
