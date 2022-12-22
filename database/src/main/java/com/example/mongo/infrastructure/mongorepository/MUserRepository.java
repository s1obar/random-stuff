//package com.example.mongo.infrastructure.mongorepository;
//
//import com.example.mongo.domain.model.GroceryItem;
//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;
//
//import java.util.List;
//
//public interface MUserRepository extends MongoRepository<GroceryItem, Long> {
//    @Query("{name: '?0'}")
//    GroceryItem findItemByName(String name);
//
//    @Query(value = "{category: '?0'}", fields = "{'name': 1, 'quantity': 1}")
//    List<GroceryItem> findAll(String category);
//}
