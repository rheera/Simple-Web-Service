package com.rfws.firstwebservice.service;

import com.rfws.firstwebservice.domain.Customer;
import com.rfws.firstwebservice.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer findCustomerById(Long id) {
        //if (customerRepository.findById(id).isPresent()) {
            return customerRepository.findById(id).get();
        //}
        //System.out.println("Customer doesn't exist");
        //return null;
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }
}
