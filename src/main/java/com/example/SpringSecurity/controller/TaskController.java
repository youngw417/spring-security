package com.example.SpringSecurity.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/task")
@CrossOrigin
public class TaskController {

    @GetMapping("/taskdetails")
    public String getEmployeeDetails() {
        return "Task Details";
    }
}
