package com.seerat.feedforward.Model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "providers")
@Getter
@Setter
public class Provider {
    @Id
    private int providerId;
    private String providerName;
    private String providerEmail;
    private int providerNumber;
    private String providerAddress;
    private String logoUrl;
    private String providerDescription;
    private boolean surplusFood;
    private int foodImpact;
}
