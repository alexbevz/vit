package ru.bevz.vit.service;

import org.springframework.stereotype.Service;
import ru.bevz.vit.domain.Event;
import ru.bevz.vit.repository.EventRepo;

import java.time.LocalDateTime;

@Service
public class EventService {

    private final EventRepo eventRepo;

    public EventService(EventRepo eventRepo) {
        this.eventRepo = eventRepo;
    }

    public void addEvent(Event event) {
        event.setDtCreation(LocalDateTime.now());
        eventRepo.save(event);
    }
}
