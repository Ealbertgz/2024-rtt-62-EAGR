package org.example.database.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;



@Setter
@Getter
@Entity
@Table(name = "customers")

public class Customer{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(name ="customer_name")
        private String customerName;

        @Column(name = "contact_lastname")
        private String contactLastname;

        @Column(name ="contact_firstname")
        private String contactFirstname;

        @Column(name = "phone")
        private Integer phone;

        @Column(name = "address_line1")
        private String addressLine1;

        @Column(name = "address_line2")
        private String addressLine2;

        @Column(name ="city")
        private String city;

        @Column(name="state")
        private String state;

        @Column (name= "postal_code")
        private String postalCode;

        @Column (name = "country")
        private String country;

        @Column (name="sales_rep_employee_id")
        private Integer salesRepEmployeeId;

        @Column (name ="credit_limit")
        private Integer creditLimit;
    }

