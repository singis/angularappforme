package com.example.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.CustomerDetails;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerDetails, String> {

	public CustomerDetails save(CustomerDetails customerDetails);



}
