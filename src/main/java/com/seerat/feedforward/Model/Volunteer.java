package com.seerat.feedforward.Model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "volunteers")
@Getter
@Setter
public class Volunteer {
    @Id
    private int volunteerId;
    private String volunteerName;
    private String volunteerEmail;
    private int volunteerNumber;
    private String profilePictureUrl;
    private boolean availability;
    private int foodDonated;
}
