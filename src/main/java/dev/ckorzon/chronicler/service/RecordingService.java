package dev.ckorzon.chronicler.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ckorzon.chronicler.model.entity.DailyRecording;
import dev.ckorzon.chronicler.persistence.DailyRecordingRepository;

@Service
public class RecordingService implements RecordingInterface {

    private static Logger logger = LoggerFactory.getLogger(RecordingService.class);

    @Autowired
    private DailyRecordingRepository recordingRepository;

    @Override
    public DailyRecording publishDailyRecording(DailyRecording dailyRecording) {
        try {
            return recordingRepository.save(dailyRecording);
        } catch (IllegalArgumentException err) {
            logger.error("Bad request when attempting to publish DailyRecording.", err);
            return null;
        }
    }
    
}
