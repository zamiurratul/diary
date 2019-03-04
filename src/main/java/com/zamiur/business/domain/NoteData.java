package com.zamiur.business.domain;

import com.zamiur.data.entity.Note;

public class NoteData {

    private Long noteId;
    private String title;
    private String content;
    private String author;

    public NoteData(Note note) {
        this.noteId = note.getId();
        this.title = note.getTitle();
        this.content = note.getContent();
        this.author = note.getAuthor();
    }

    public Long getNoteId() {
        return noteId;
    }

    public void setNoteId(Long noteId) {
        this.noteId = noteId;
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
}
