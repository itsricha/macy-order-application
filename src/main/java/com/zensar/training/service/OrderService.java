package com.zensar.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {
	
	@Autowired
	RestTemplate template;
	
	public String updateOrderStatus(int orderId, String status) {
		String url = String.format("%s/%s/%s", "http://localhost:9090/macyCosumerApp/update/status",orderId,status);
		
		// http://localhost:9090/macyCosumerApp/order/update/status/10/Confirmed
		System.out.println(template);
		// http client or resttemplate
		ResponseEntity<String> response = template.exchange(url, HttpMethod.PUT, null, String.class);
		return response.getBody();
	}

}
