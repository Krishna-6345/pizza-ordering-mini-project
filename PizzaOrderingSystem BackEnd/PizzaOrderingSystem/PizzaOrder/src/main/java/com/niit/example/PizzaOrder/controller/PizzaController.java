package com.niit.example.PizzaOrder.controller;

import com.niit.example.PizzaOrder.model.PizzaOrder;
import com.niit.example.PizzaOrder.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2/")
public class PizzaController {
    private PizzaService pizzaService;
    private ResponseEntity responseEntity;

    @Autowired
    public PizzaController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @PostMapping("pizza/{emailAddress}")
    public ResponseEntity<?> savePizza(@RequestBody PizzaOrder pizzaOrder,@PathVariable String emailAddress)  {
            pizzaOrder.setEmailAddress(emailAddress);
            pizzaService.savePizza(pizzaOrder);
            responseEntity = new ResponseEntity(pizzaOrder, HttpStatus.CREATED);
        return responseEntity;

    }
    @GetMapping("pizza")
    public ResponseEntity<?> getAllOrder(){

            responseEntity = new ResponseEntity(pizzaService.getAllOrder(), HttpStatus.OK);

        return responseEntity;
    }
    @GetMapping("pizza/{emailAddress}")
    public ResponseEntity<?> getAllPizzaByEmail(@PathVariable String emailAddress)
    {

            responseEntity=new ResponseEntity(pizzaService.getAllPizzaByEmail(emailAddress),HttpStatus.OK);
        return responseEntity;

    }
    @DeleteMapping("pizza/{pizzaId}")
    public ResponseEntity<?> deletePizzaFromOrder(@PathVariable String pizzaId) {

        boolean res = pizzaService.deleteOrderFromCart(pizzaId);

            responseEntity = new ResponseEntity<>(pizzaId, HttpStatus.OK);
            return responseEntity;
        }

    }



