package com.example.springboot.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@SequenceGenerator(name = "sanha_seq_gen" , sequenceName = "sanha_seq" , allocationSize = 1)
@Table(name = "Sanha")
public class Sanha extends BasicEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sanha_seq_gen")
    @Column(name = "SANHA_ID")
    private Long id;

    @Column(nullable = false, length = 100, name = "SANHA_NAME")
    private String name;

    @Enumerated(EnumType.STRING)
    private TopAndDown topAndDown;

    @ManyToOne
    @JoinColumn(name = "YANOLJA_ID")
    private Yanolja yanolja;

    public Sanha(String name, TopAndDown topAndDown) {
        this.name = name;
        this.topAndDown = topAndDown;
    }
}
