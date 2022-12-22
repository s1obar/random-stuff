package com.example.mongo.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document("grocery-items")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class GroceryItem {
    @Id
    private String id;
    private String name;
    private int quantity;
    private String category;
}
