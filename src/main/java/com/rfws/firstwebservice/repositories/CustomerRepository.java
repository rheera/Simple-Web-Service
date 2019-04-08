package com.rfws.firstwebservice.repositories;

import com.rfws.firstwebservice.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

//have long in there for the customer ID
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
