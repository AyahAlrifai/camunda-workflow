package com.ebp.workflow.controller;

import com.ebp.workflow.service.TakeOrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private final TakeOrderService takeOrderService;


    public OrderController(TakeOrderService takeOrderService) {
        this.takeOrderService = takeOrderService;
    }

    @GetMapping("/order")
    public ResponseEntity<String> takeOrder(@RequestParam String order) {
        return ResponseEntity.ok(takeOrderService.takeOrder(order));
    }
}
