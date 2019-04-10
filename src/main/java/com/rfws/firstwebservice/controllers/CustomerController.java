package com.rfws.firstwebservice.controllers;

import com.rfws.firstwebservice.domain.Customer;
import com.rfws.firstwebservice.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//designates this class as a rest controller
@RestController
@RequestMapping(CustomerController.BASE_URL)
public class CustomerController {

    //base url, don't repeat yourself, you can put it in a property file externalize it to easily change it
    public static final String BASE_URL = "/api/v1/customers";

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    List<Customer> getAllCustomers(){
       return customerService.findAllCustomers();
    }
    //get mapping includes request mapping
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id){
        return customerService.findCustomerById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.GONE)
    public void deleteCustomer(@RequestBody Customer customer){
        customerService.deleteCustomer(customer);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateCustomer(@RequestBody Customer customer){
        customerService.updateCustomer(customer);
    }
}
