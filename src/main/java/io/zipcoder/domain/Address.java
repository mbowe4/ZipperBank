package io.zipcoder.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Address {

    @Id
    @GeneratedValue
    private Long id;
    private String streetNumber;
    private String streetName;
    private String city;
    private String state;
    private String zip;
}
