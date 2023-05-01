package com.geekster.UniversityEventManagement.controller;

import com.geekster.UniversityEventManagement.model.Event;
import com.geekster.UniversityEventManagement.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class EventController {
    @Autowired
    EventService eventService;

    @PostMapping(value="/addEvent")
    public String addEvents(@RequestBody List<Event> event){
        return eventService.addEvents(event);
    }

    @GetMapping(value= "/getEventByDate/{date}")
    public List<Event> getEventById(@PathVariable LocalDate date){
        return eventService.getEventByDate(date);
    }

    @DeleteMapping(value = "/deleteByEventName/{eventName}")
    public void deleteEvent(@PathVariable String eventName){
        eventService.deleteEvent(eventName);
    }
}
