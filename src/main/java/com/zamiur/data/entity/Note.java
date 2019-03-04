package com.zamiur.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "NOTE")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String content;
    private String author;

//    @ManyToOne
//    @JoinColumn
//    private Diary diary;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

//    public Diary getDiary() {
//        return diary;
//    }
//
//    public void setDiary(Diary diary) {
//        this.diary = diary;
//    }
}
