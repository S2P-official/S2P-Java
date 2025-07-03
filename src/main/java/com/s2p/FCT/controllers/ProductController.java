package com.s2p.FCT.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.s2p.FCT.entity.Product;
import com.s2p.FCT.services.ProductService;
@CrossOrigin(origins = "*")
@RestController()
public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping("/addProduct")
	public Product saveProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}
	
	@PutMapping("/updateProduct")
	public Product updateProduct(@RequestBody Product product) {
		return productService.updateProduct(product);
	}
	
	@GetMapping("/getAllProducts")
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
}
