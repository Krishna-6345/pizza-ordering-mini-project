package com.niit.example.PizzaOrder.repository;

import com.niit.example.PizzaOrder.model.PizzaOrder;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PizzaRepository extends MongoRepository<PizzaOrder,String>{

    public List<PizzaOrder> getAllPizzaByEmailAddress(String emailAddress);

}
