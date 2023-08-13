package com.example.SpringSecurity.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customer")
@CrossOrigin
public class CustomerController {

    @GetMapping("/customerdetails")
    public String getEmployeeDetails() {
        return "Customer Details";
    }
}
