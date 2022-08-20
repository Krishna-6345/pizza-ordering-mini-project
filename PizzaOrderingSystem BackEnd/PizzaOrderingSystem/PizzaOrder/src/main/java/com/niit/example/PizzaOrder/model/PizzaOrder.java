package com.niit.example.PizzaOrder.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class PizzaOrder {
    @Id
    private String pizzaId;
    private String pizzaName;
    private String pizzaPrice;
    private String pizzaImageUrl;
    private String star;
    private String emailAddress;

    public PizzaOrder() {
    }

    public PizzaOrder(String pizzaId, String pizzaName, String pizzaPrice, String pizzaImageUrl, String star, String emailAddress) {
        this.pizzaId = pizzaId;
        this.pizzaName = pizzaName;
        this.pizzaPrice = pizzaPrice;
        this.pizzaImageUrl = pizzaImageUrl;
        this.star = star;
        this.emailAddress = emailAddress;
    }

    public String getPizzaId() {
        return pizzaId;
    }

    public void setPizzaId(String pizzaId) {
        this.pizzaId = pizzaId;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String getPizzaPrice() {
        return pizzaPrice;
    }

    public void setPizzaPrice(String pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }

    public String getPizzaImageUrl() {
        return pizzaImageUrl;
    }

    public void setPizzaImageUrl(String pizzaImageUrl) {
        this.pizzaImageUrl = pizzaImageUrl;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "PizzaOrder{" +
                "pizzaId='" + pizzaId + '\'' +
                ", pizzaName='" + pizzaName + '\'' +
                ", pizzaPrice='" + pizzaPrice + '\'' +
                ", pizzaImageUrl='" + pizzaImageUrl + '\'' +
                ", star='" + star + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
