package dev.ckorzon.chronicler.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "mood")
@Data
public class Mood {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mood_id")
    private Integer moodId;

    @Column(name = "mood_name", nullable = false, length = 32)
    private String moodName;

    @Column(name = "is_positive", nullable = false)
    private Boolean isPositive;
}
