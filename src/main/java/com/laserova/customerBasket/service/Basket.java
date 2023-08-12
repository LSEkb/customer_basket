package com.laserova.customerBasket.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import java.util.*;

@Component
@SessionScope
public class Basket {

    private Map<Integer, Integer> order;

    public Basket() {
        order = new HashMap<>();
    }

    public void addToBasket(Integer productsId, Integer quantity) {
        order.put(productsId, quantity);
        System.out.println("basket");
    }

    public Set<Integer> getFromBasket() {
        return order.keySet();
    }


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

