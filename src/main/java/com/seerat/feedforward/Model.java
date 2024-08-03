// NOT REQUIRED

// package com.seerat.feedforward;

// import lombok.Getter;
// import lombok.Setter;

// public class Model {
//     @Document(collection = "volunteers")
//     @Getter
//     @Setter
//     public static class Volunteer {
//         @Id
//         private int volunteerId;
//         private String volunteerName;
//         private String volunteerEmail;
//         private int volunteerNumber;
//         private String profilePictureUrl;
//         private boolean availability;
//         private int foodDonated;
//     }

//     @Document(collection = "providers")
//     @Getter
//     @Setter
//     public static class Provider {
//         @Id
//         private int providerId;
//         private String providerName;
//         private String providerEmail;
//         private int providerNumber;
//         private String providerAddress;
//         private String logoUrl;
//         private String providerDescription;
//         private boolean surplusFood;
//         private int foodImpact;
//     }

//     @Document(collection = "foodItem")
//     @Getter
//     @Setter
//     public static class FoodItem {
//         @Id
//         private int itemId;
//         private String itemName;
//         private String itemDescription;
//         private String itemCategory;
//         private String imageUrl;
//         private boolean status;
//     }
// }
