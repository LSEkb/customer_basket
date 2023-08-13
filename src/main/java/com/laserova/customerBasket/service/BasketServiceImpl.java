package com.laserova.customerBasket.service;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Set;

@Service
public class BasketServiceImpl implements BasketService {
    private final Basket basket;

    public BasketServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void addProduct(Map<String,String> products) {
        products.entrySet().stream().forEach(p -> basket.addToBasket(p.getKey(), p.getValue()));
    }

    @Override
    public Set<String> getProducts() {
        return basket.getFromBasket();
    }
}
