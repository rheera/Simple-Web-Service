package com.rfws.firstwebservice.service;

import com.rfws.firstwebservice.domain.Customer;

import java.util.List;

public interface CustomerService {
    Customer findCustomerById(Long id);
    List<Customer> findAllCustomers();

    Customer saveCustomer(Customer customer);

    void deleteCustomer(Customer customer);
}
