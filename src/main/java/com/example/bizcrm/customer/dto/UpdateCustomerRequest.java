package com.example.bizcrm.customer.dto;

import jakarta.validation.constraints.Email;
import lombok.Getter;

@Getter
public class UpdateCustomerRequest {

    private String name;

    @Email
    private String email;

    private String phone;

    private String company;

    private String memo;
}
