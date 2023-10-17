package com.library.book.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
public class Book {

    @Id
    @GeneratedValue
    private long id;

    @Setter
    @Column
    private String name;

    @Setter
    @CreationTimestamp
    @Basic(optional = false)
    @Column(updatable= false)
    private LocalDateTime createdAt;

    @Setter
    @UpdateTimestamp
    @Basic(optional = false)
    private LocalDateTime updatedAt;


}
