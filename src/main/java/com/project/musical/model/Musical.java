package com.project.musical.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Musical {

    @Id @GeneratedValue
    private Integer id;

    private String name;

    @OneToOne(fetch = FetchType.LAZY)
    private Theater theater;

    @Enumerated(value = EnumType.STRING)
    private Producer producer;

    @ManyToOne(fetch = FetchType.LAZY)
    private List<Actor> actors;

    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
