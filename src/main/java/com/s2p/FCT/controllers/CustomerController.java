package com.s2p.FCT.controllers;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.s2p.FCT.entity.Customers;
//
//import jakarta.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
//
//	@Autowired
//	private CustomerController customerController;

//    @PostMapping
//    public ResponseEntity<Customers> create(@RequestBody Customers customers) {
//        return new ResponseEntity<>(customersService.createCustomer(customers), HttpStatus.CREATED);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Customers> get(@PathVariable Long id) {
//        Customers customer = customersService.getCustomerById(id);
//        return ResponseEntity.ok(customer);
//    }
//    @GetMapping
//    public ResponseEntity<?> getAll() {
//        List<Customers> customers = customersService.getAllCustomers();
//
//        if (customers == null || customers.isEmpty()) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No customers found.");
//        }
//
//        return ResponseEntity.ok(customers);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Customers updatedCustomer) {
//        try {
//            Customers customer = customersService.updateCustomer(id, updatedCustomer);
//            return ResponseEntity.ok(customer);
//        } catch (EntityNotFoundException e) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Customer not found with id: " + id);
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to update customer.");
//        }
//    }

//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> delete(@PathVariable Long id) {
//        customersService.deleteCustomer(id);
//        return ResponseEntity.noContent().build();
//    }
}
