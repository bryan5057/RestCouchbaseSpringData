
package com.travelport.RestCouchbaseSpringData;

import java.util.List;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface TravelerRepository extends CouchbaseRepository<Traveler, String> {

	List<Traveler> findByLastName(@Param("name") String name);
	
	List<Traveler> findByFirstNameAndLastName(@Param("firstName") String firstName, @Param("lastName") String lastName);

}