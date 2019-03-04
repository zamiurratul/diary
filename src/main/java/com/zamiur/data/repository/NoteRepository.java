package com.zamiur.data.repository;

import com.zamiur.data.entity.Note;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends CrudRepository<Note, Long> {
    Note findByAuthor(String author);
}
