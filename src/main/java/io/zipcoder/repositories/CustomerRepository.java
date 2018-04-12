package io.zipcoder.repositories;

import io.zipcoder.domain.Address;
import io.zipcoder.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findCustomerByAccountId(long id);

    List<Customer> findAll();

    Customer findCustomerById(long id);


}
