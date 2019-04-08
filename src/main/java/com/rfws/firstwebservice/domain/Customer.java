package com.rfws.firstwebservice.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//From project lombok, helps you easily set up getters and setters
// Make sure preferences-> Build, execution, deployment -> Compiler -> Annotation Processors -> Enable Annotation Processing is checked
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;

}
