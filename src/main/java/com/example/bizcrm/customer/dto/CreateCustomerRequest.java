package com.example.bizcrm.customer.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class CreateCustomerRequest {

    @NotBlank
    private String name;

    @Email
    private String email;

    private String phone;

    private String company;

    private String memo;
}
