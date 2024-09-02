package dev.ckorzon.chronicler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

import dev.ckorzon.chronicler.model.entity.Activity;
import dev.ckorzon.chronicler.model.entity.DailyRecording;
import dev.ckorzon.chronicler.service.RecordingInterface;

@RestController
public class JournalController {

    @Autowired
    private RecordingInterface recordingInterface;

    @PostMapping("/api/activity")
    public ResponseEntity<Activity> postActivityDefinition(Activity activity) {
        // Todo
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/api/activity-definitions")
    public ResponseEntity<Set<Activity>> getActivityDefinitions() {
        // Todo
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<DailyRecording> postJournalRecording(DailyRecording recording) {
        // Todo
        return new ResponseEntity<DailyRecording>(recordingInterface.publishDailyRecording(recording), HttpStatus.OK);
    }
}
