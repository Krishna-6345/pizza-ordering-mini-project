package com.niit.example.PizzaOrder.service;

import com.niit.example.PizzaOrder.model.PizzaOrder;
import com.niit.example.PizzaOrder.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PizzaServiceImpl implements PizzaService {
private PizzaRepository pizzaRepository;
    @Autowired
    public PizzaServiceImpl(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    @Override
    public PizzaOrder savePizza(PizzaOrder pizzaOrder) {
        return pizzaRepository.save(pizzaOrder);
    }
    @Override
    public List<PizzaOrder> getAllOrder()  {
        return pizzaRepository.findAll();
    }
    @Override
    public List<PizzaOrder> getAllPizzaByEmail(String emailAddress)  {
        return pizzaRepository.getAllPizzaByEmailAddress(emailAddress);
    }
    @Override
    public boolean deleteOrderFromCart(String pizzaId)  {
        if(pizzaRepository.findById(pizzaId).isPresent()){
            pizzaRepository.deleteById(pizzaId);
            return true;
        }
        return false;
    }
}
