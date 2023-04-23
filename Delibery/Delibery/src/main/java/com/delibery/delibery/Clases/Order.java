package com.delibery.delibery.Clases;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "customer_name", nullable = false)
    private String customerName;
    @Column(name = "customer_email", nullable = false)
    private String customerEmail;
    @Column(name = "status", nullable = false)
    private String status;
    @Column(name = "creation_time", nullable = false)
    private Long creationTime;
    @Column(name = "estimated_delivery_time", nullable = false)
    private Long estimatedDeliveryTime;
    @Column(name = "items", nullable = false)
    private Integer items;
}
