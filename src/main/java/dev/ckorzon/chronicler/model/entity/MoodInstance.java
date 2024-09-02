package dev.ckorzon.chronicler.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "mood_instance")
@Data
public class MoodInstance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mood_inst_id")
    private Long moodInstanceId;

    @ManyToOne
    @JoinColumn(name = "mood_id", nullable = false)
    private Mood mood;

    @ManyToOne
    @JoinColumn(name = "recording_id", nullable = false)
    private DailyRecording dailyRecording;
}
