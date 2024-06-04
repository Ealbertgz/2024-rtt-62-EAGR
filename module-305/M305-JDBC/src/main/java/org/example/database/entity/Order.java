package org.example.database.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "orders")

public class Order {


        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        private Integer id;

        @Column(name="customer_id")
        private Integer customerId;

        @Column(name= "order_date")
        private Integer orderDate;

        @Column (name ="required_date")
        private Integer requiredDate;

        @Column (name = "shipped_date")
        private Integer shippedDate;

        @Column (name= "status")
        private String status;

        @Column (name ="comments")
        private String comments;
    }

