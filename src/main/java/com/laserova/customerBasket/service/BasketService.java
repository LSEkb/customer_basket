package com.laserova.customerBasket.service;

import java.util.Map;
import java.util.Set;

public interface BasketService {
    void addProduct(Map<String,String> hashMap);
    Set<String> getProducts();
}
