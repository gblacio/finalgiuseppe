package com.example.test.entities;

import jakarta.persistence.*;
@Entity
@Table(name = "category")
public class Category {
    @Id
    @Column(name = "Catcode")
    private Integer catcode;

    @Column(name = "Catdesc")
    private String catdesc;

}
