package com.laserova.customerBasket.controller;

import com.laserova.customerBasket.service.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping(path = "/order")
public class OrderController {

    private BasketService basketService;

    public OrderController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping(path = "/add")
    public String addProducts(@RequestParam Map<String,String> products) {
        basketService.addProduct(products);
        return "Товары успешно добавлены";
    }

    @GetMapping(path = "/get")
    public Set<String> getProducts() {
        return basketService.getProducts();
    }
}
