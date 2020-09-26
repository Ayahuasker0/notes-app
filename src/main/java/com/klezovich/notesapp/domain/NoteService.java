package com.klezovich.notesapp.domain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class NoteService {

    // private final NoteRepository noteRepository;

    public Note createNote(String name, String text) {
        log.info("Creating new note with name {}", name);
        var note = new Note(name, text);

        // Need to save note to DB
        // noteRepository.save(note)

        return note;
    }

}
