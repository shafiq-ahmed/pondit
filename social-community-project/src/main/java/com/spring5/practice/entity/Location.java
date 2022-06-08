package com.spring5.practice.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="location_name")
    private String locationName;
}
