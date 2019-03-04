package com.zamiur.business.service;

import com.zamiur.business.domain.NoteData;
import com.zamiur.data.entity.Note;
import com.zamiur.data.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DiaryService {
    private final NoteRepository noteRepository;

    @Autowired
    public DiaryService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public List<NoteData> getNotes(){
        Iterable<Note> notes = this.noteRepository.findAll();
        Map<Long, NoteData> noteDataMap = new HashMap<>();

        notes.forEach( note -> {
            NoteData noteData = new NoteData(note);
            noteDataMap.put(noteData.getNoteId(), noteData);
        });

        List<NoteData> noteDataList = new ArrayList<>(noteDataMap.values());
        return noteDataList;
    }

    public Boolean saveNote(){
        Note note = new Note();
        note.setTitle("My Second Note");
        note.setContent("I am Learning mySQL JDBC Connection");
        note.setAuthor("Ratul");
        noteRepository.save(note);
        //TODO how to know if saved without error
        if(note.getId() != 0){
            return true;
        }
        return false;
    }
}
