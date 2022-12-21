package com.example.domain.repository;

import com.example.controller.localexception.CustomerNotFoundException;
import com.example.domain.model.Customer;
import com.example.infrastructure.jpa.entity.CustomerEntity;
import com.example.infrastructure.jpa.repository.CustomerJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CustomerRepository {
    private final CustomerJpaRepository customerJpaRepository;
    public Customer getCustomerById(Long id) throws CustomerNotFoundException{
        CustomerEntity customerEntity = customerJpaRepository.findById(id).orElseThrow(() -> new CustomerNotFoundException("Customer does not exist in db."));

        return mapFromEntity(customerEntity);
    }

    private Customer mapFromEntity(CustomerEntity customerEntity) {
        return Customer.builder().id(customerEntity.getId()).name(customerEntity.getName()).build();
    }
}
