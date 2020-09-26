package com.klezovich.notesapp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class NoteController {

    //private final NoteService noteService;

    // Create a note
    @PostMapping("/note/create")
    public String createNote(
        @RequestParam(name = "note_name") String name,
        @RequestParam(name = "note_text") String text
        ) {

        log.info("Note name is:" + name);
        log.info("Note text is:" + text);

        //noteService.saveNote(name,text);

        return "note created";
    }

    // Edit note
    // Get list of all notes
    // Delete note by name
    // Search notes by name

//    @RequestMapping("/hello")
//    public String sayHello() {
//
//        var obj = new SuperComplicatedCalculations();
//        return "hello from Tarasik" + obj.calculatePiToTheLastDigin();
//    }
//
//    class SuperComplicatedCalculations {
//
//        public String calculatePiToTheLastDigin(){
//            return "3.141451515";
//        }
//    }
}
