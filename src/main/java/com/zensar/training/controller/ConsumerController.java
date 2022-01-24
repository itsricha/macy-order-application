package com.zensar.training.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.training.dto.OrderList;
import com.zensar.training.dto.OrderListxml;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

	//@PostMapping("/json/message")
	@RequestMapping(value = "/", method = RequestMethod.POST, consumes = { "application/json", "application/xml" })
	public String consumeJsonMessage(@RequestBody OrderList order) {
		System.out.println(order.getCommand());
		return "";
	}
	//@RequestMapping(value = "/xml", method = RequestMethod.POST, consumes = {  "application/xml" })
	@PostMapping(value = "/xml", consumes = {  "application/xml" })
	public String consumeXMLMessage(@RequestBody OrderListxml orderlistxml) {
		System.out.println(orderlistxml);
		return "";
	}
	
	
}
