package com.rfws.firstwebservice.controllers;

import com.rfws.firstwebservice.domain.Customer;
import com.rfws.firstwebservice.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
