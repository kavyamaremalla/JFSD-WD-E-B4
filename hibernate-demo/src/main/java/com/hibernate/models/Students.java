package com.hibernate.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "students")
@Data
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int StudentId;

    @Column(name = "FirstName")
    private String firstName ;

    private String LastName;

    private Boolean isCertified;

    private String city;

}
