package com.laserova.customerBasket.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import java.util.*;

@Component
@SessionScope
public class Basket {

    private Map<String, String> order;

    public Basket() {
        order = new HashMap<>();
    }

    public void addToBasket(String productsId, String quantity) {
        order.put(productsId, quantity);
    }

    public Set<String> getFromBasket() {
        return order.keySet();
    }
}

