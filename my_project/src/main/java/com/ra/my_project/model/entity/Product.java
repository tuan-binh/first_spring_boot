package com.ra.my_project.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "products")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private String description;
    private int price;
    private int stock;
    private Boolean status;

}
