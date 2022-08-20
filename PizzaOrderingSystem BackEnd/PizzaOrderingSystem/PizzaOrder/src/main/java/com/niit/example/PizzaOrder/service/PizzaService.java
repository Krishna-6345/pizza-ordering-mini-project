package com.niit.example.PizzaOrder.service;

import com.niit.example.PizzaOrder.model.PizzaOrder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PizzaService {
     PizzaOrder savePizza(PizzaOrder pizzaOrder);
     List<PizzaOrder> getAllOrder() ;
     List<PizzaOrder> getAllPizzaByEmail(String emailAddress);
     boolean deleteOrderFromCart(String pizzaId);
}
