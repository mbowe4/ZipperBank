package io.zipcoder.service;

import io.zipcoder.domain.Customer;
import io.zipcoder.repositories.CustomerRepository;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.session.SessionProperties;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {


    @Autowired
    private CustomerRepository customerRepository;

    public Customer findByAccountId(long accountId) {
        return customerRepository.findCustomerByAccountId(accountId);
    }

    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer findByCustomerId(long id) {
        return customerRepository.findCustomerById(id);
    }
}
