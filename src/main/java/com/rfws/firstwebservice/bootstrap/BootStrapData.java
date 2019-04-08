package com.rfws.firstwebservice.bootstrap;

import com.rfws.firstwebservice.domain.Customer;
import com.rfws.firstwebservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
//initialization routine to initialize data
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loading customer data");

        Customer c1 = new Customer();
        c1.setFirstname("Michael");
        c1.setLastname("Weston");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstname("Sam");
        c2.setLastname("Axe");
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setFirstname("Fiona");
        c3.setLastname("Glenanne");
        customerRepository.save(c3);

        System.out.println("Customers saved: " + customerRepository.count());

    }
}
