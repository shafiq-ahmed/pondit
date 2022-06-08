package com.spring5.practice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "tbl_user")
public class User implements Serializable {

    @Id
    @Column(name = "id")
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="password")
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
