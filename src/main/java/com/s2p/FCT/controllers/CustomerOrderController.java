package com.s2p.FCT.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.s2p.FCT.entity.CustomerOrder;
import com.s2p.FCT.services.CustomerOrderService;

@RestController
public class CustomerOrderController {
	
	@Autowired
	CustomerOrderService customerOrderService;
	
	@PostMapping("/order")
	public CustomerOrder saveOrder(@RequestBody CustomerOrder customerOrder) {
		return customerOrderService.saveOrder(customerOrder);
	}

}
