package com.spring5.practice.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="attachment")
public class Attachment {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="at_id")
    private long id;

    @Column(name="attachment_name")
    private String attachmentName;

    @Column(name="attachment_path")
    private  String attachmentPath;

    private String type;
}
