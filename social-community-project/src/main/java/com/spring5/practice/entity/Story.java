package com.spring5.practice.entity;

import lombok.Data;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name="story")
public class Story {
    @Id
    @Column(name="st_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;

    private long userId;
    private String description;

    private String privacy;

    private long locationId;

    @Column(name="created_date")
    private LocalDateTime createdDate;

    @Column(name="is_deleted")
    private boolean isDeleted;

    @OneToMany(fetch=FetchType.LAZY)
    @JoinTable(name="status_attachments",
                joinColumns = {@JoinColumn(name="story_id", referencedColumnName = "st_id")},
                inverseJoinColumns = {@JoinColumn(name="attachment_id",referencedColumnName = "at_id")}
    )
    private List<Attachment> statusAttachments;
}
