package com.geekster.UniversityEventManagement.service;

import com.geekster.UniversityEventManagement.model.Event;
import com.geekster.UniversityEventManagement.repository.IEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EventService {
    @Autowired
    IEventRepository eventDao;

    public String addEvents(List<Event> event) {
        Iterable<Event> eventsNow = eventDao.saveAll(event);
        if(eventsNow!=null)
            return "Event's were added";
        else
            return "Invalid Event's";

    }

    public List<Event> getEventByDate(LocalDate date) {
        return eventDao.findByDate(date);
    }

    public void deleteEvent(String eventName) {
        eventDao.deleteByEventName(eventName);
    }
}
