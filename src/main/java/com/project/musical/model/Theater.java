package com.project.musical.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Theater {

    @Id @GeneratedValue
    private Integer id;

    private String name;

    private String address;
}
