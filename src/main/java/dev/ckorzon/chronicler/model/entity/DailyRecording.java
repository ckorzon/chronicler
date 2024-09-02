package dev.ckorzon.chronicler.model.entity;

import java.sql.Date;
import java.time.LocalDateTime;

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
@Table(name="daily_recording")
@Data
public class DailyRecording {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recording_id")
    private Long recordingId;

    @ManyToOne
    @JoinColumn(name = "app_user_id", nullable = false)
    private AppUser appUser;

    @Column(name = "recording_date", nullable = false)
    private Date recordingDate;

    @Column(name = "journal_entry", length = 1000)
    private String journalEntry;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;
}
