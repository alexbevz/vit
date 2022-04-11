package ru.bevz.itv.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "\"event\"")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "application_id")
    private Application application;

    @Column(name = "dt_creation")
    private LocalDateTime dtCreation;

    public Event(String name, String description, Application application, LocalDateTime dtCreation) {
        this.name = name;
        this.description = description;
        this.application = application;
        this.dtCreation = dtCreation;
    }

}