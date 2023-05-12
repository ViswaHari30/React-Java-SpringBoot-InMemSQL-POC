package com.corvanta.hostel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.corvanta.hostel.entity.Hosteller;
import com.corvanta.hostel.entity.Location;

@RepositoryRestResource()
public interface LocationRepository extends JpaRepository<Location, Integer>, JpaSpecificationExecutor<Location>,
		QuerydslPredicateExecutor<Location> {
	
	Location deleteById(int id);
}
