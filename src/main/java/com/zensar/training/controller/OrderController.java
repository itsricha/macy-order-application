package com.zensar.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.training.service.OrderService;

@RestController("/order")
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	@PutMapping("/update/status/{id}/{status}")
	public String updateOrderStatus(@PathVariable(value = "id") int orderId, 
			@PathVariable(value = "status") String status) {
		return service.updateOrderStatus(orderId,status);
	}
	
}
