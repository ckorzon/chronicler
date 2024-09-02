package dev.ckorzon.chronicler.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.ckorzon.chronicler.model.entity.DailyRecording;

@Repository
public interface DailyRecordingRepository extends JpaRepository<DailyRecording, Long> {
    
}
