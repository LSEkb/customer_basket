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
    public void addProduct(Map<Integer,Integer> products) {

        products.entrySet().stream().forEach(p -> basket.addToBasket(p.getKey(), p.getValue()));
        System.out.println("service");
    }

    @Override
    public Set<Integer> getProducts() {
        return basket.getFromBasket();
    }
}
