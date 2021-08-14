package com.project.musical.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Actor {

    @Id @GeneratedValue
    private Integer id;

    private String name;

    private Integer age;

    private String profilePath;

    @OneToMany
    private List<Musical> musicals;
}
