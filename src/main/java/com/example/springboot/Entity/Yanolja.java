package com.example.springboot.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.LAZY;

@Getter
@Entity
@NoArgsConstructor
@SequenceGenerator(name = "yanolja_seq_gen" , sequenceName = "yanolja_seq" , allocationSize = 1)
@Table(name ="YANOLJA")
public class Yanolja extends BasicEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "yanolja_seq_gen")
    @Column(name = "YANOLJA_ID")
    private Long id;

    @Column(nullable = false, length = 100, name="YANOLJA_NAME")
    private String name;

    @OneToMany(mappedBy ="yanolja", fetch = LAZY, cascade = CascadeType.ALL)
    private List<Sanha> sanhaList = new ArrayList<>();

    public Yanolja(String name , Sanha sanha) {
        this.name = name;
        sanha.setYanolja(this);
        this.sanhaList.add(sanha);
    }

}
