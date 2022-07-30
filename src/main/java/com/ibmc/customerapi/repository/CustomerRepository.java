package com.ibmc.customerapi.repository;

import com.ibmc.customerapi.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository <Customer,Integer> {
}
