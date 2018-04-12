package io.zipcoder.controller;

import io.zipcoder.domain.Customer;
import io.zipcoder.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value="/accounts/{customerId}/customer", method = RequestMethod.GET)
    public ResponseEntity<Customer> lookUpByAccountId(@PathVariable long accountId) {
        Customer result = customerService.findByAccountId(accountId);
        return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
    }

    @RequestMapping(value="/customers", method = RequestMethod.GET)
    public ResponseEntity<?> listAllCustomers() {
        return new ResponseEntity<Iterable<Customer>>(customerService.findAllCustomers(), HttpStatus.OK);
    }

    @RequestMapping(value="/customers/{id}")
    public ResponseEntity<?> lookUpById(@PathVariable long id) {
        return new ResponseEntity<>(customerService.findByCustomerId(id), HttpStatus.OK);
    }


}
