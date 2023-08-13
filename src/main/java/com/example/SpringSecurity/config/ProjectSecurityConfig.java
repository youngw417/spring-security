package com.example.SpringSecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception{

        http.authorizeHttpRequests()
                .requestMatchers("/api/v1/customer/customerdetails").authenticated()
                .requestMatchers("/api/v1/employee/employeedetails").authenticated()
                .requestMatchers("/api/v1/task/taskdetails").permitAll()
                .and().formLogin();
        return http.build();

    }
}
