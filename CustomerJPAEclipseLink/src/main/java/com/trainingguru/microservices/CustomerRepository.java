package com.trainingguru.microservices;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    // You can define custom query methods here if needed
}

