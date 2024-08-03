package com.seerat.feedforward.Model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "foodItem")
@Getter
@Setter
public class FoodItem {
    @Id
    private int itemId;
    private String itemName;
    private String itemDescription;
    private String itemCategory;
    private String imageUrl;
    private boolean status;
}
