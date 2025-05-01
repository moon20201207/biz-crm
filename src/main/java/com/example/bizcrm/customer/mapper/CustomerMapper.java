package com.example.bizcrm.customer.mapper;

@Component
public class CustomerMapper {

    public Customer toEntity(CreateCustomerRequest request) {
        return Customer.builder()
            .name(request.getName())
            .email(request.getEmail())
            .phone(request.getPhone())
            .company(request.getCompany())
            .memo(request.getMemo())
            .build();
    }

    public CustomerResponse toResponse(Customer customer) {
        return CustomerResponse.builder()
            .id(customer.getId())
            .name(customer.getName())
            .email(customer.getEmail())
            .phone(customer.getPhone())
            .company(customer.getCompany())
            .memo(customer.getMemo())
            .build();
    }
}
