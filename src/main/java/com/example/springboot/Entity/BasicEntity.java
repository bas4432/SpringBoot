package com.example.springboot.Entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;

@MappedSuperclass
public class BasicEntity {

    @Column(name="CREATE_DATE")
    @CreationTimestamp
    private LocalDate localDate;
}
