package com.s2p.FCT.services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.s2p.FCT.entity.CustomerOrder;
import com.s2p.FCT.repositories.CustomerOrderRepo;
import com.s2p.FCT.repositories.ProductRepository;

@Service
public class CustomerOrderService {

	@Autowired
	CustomerOrderRepo customerOrderRepo;
	
	@Autowired
	ProductRepository productRepository;
	
	public CustomerOrder saveOrder(CustomerOrder customerOrder) {
		if(productRepository.existsById(customerOrder.getProductId())) {
			customerOrder.setOrderedDate(LocalDate.now());
			return customerOrderRepo.save(customerOrder);
		}else {
			throw new RuntimeException("Invalid ProductId");
		}
	}
	

}
