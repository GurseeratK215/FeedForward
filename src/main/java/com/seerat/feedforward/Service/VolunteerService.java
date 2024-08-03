package com.seerat.feedforward.Service;

import com.seerat.feedforward.Model.Volunteer;
import com.seerat.feedforward.Repository.VolunteerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VolunteerService {

    @Autowired
    private VolunteerRepository volunteerRepository;

    public List<Volunteer> getAllVolunteers() {
        return volunteerRepository.findAll();
    }

    public Volunteer getVolunteerById(int id) {
        Optional<Volunteer> volunteer = volunteerRepository.findById(id);
        return volunteer.orElse(null);
    }

    public Volunteer createVolunteer(Volunteer volunteer) {
        return volunteerRepository.save(volunteer);
    }

    public Volunteer updateVolunteer(int id, Volunteer volunteer) {
        if (volunteerRepository.existsById(id)) {
            volunteer.setVolunteerId(id);
            return volunteerRepository.save(volunteer);
        } else {
            return null;
        }
    }

    public void deleteVolunteer(int id) {
        if (volunteerRepository.existsById(id)) {
            volunteerRepository.deleteById(id);
        }
    }
}
