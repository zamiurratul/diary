package com.zamiur.data.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "DIARY")
public class Diary {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

//    @OneToMany
//    private Set<Note> note;
}
