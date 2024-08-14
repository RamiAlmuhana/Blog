package com.ramiblog.backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Blog {
    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String description;
    private String img;
    private LocalDateTime date;
    private Visibility visibility;

    public enum Visibility {
        Private,
        Public
    }
}
