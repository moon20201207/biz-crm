package com.example.bizcrm.customer.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class CustomerListResponse {
    private List<CustomerResponse> customers;
}
