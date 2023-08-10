package com.laserova.customerBasket.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@Component
@SessionScope
public class Basket {
    private Map<Integer, Integer> basket;

    public Basket(Integer productsId, Integer quantity) {
        this.basket = new HashMap<>();
    }

    public void addToBasket (Integer productsId, Integer quantity){
        basket.put(productsId,quantity);
    }

    public Set<Integer> getFromBasket(){
        return basket.keySet();
    }

//    public int getProductId() {
//        return productId;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(productId);
//    }
//
//    @Override
//    public boolean equals(Object other) {
//        if (this == other) {
//            return true;
//        }
//        if (other == null || getClass() != other.getClass()) {
//            return false;
//        }
//        Basket basket = (Basket) other;
//        return productId == (basket.getProductId()) && quantity == (basket.getQuantity());
//    }
}

