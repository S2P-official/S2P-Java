//package com.s2p.FCT.services;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.s2p.FCT.entity.Customers;
//import com.s2p.FCT.repositories.CustomersRepository;
//
//@Service
//public class CustomerService implements customersInterfaces.CustomerService {
//
//    @Autowired
//    private CustomersRepository customersRepository;
//
//    @Autowired
//    public void CustomersService(CustomersRepository customersRepository) {
//        this.customersRepository = customersRepository;
//    }
//
//    
//    
//    @Override
//    public Customers createCustomer(Customers customers) {
//        return customersRepository.save(customers);
//    }
//
//    @Override
//    public Customers getCustomerById(Long id) {
//        return customersRepository.findById(id)
//                .orElseThrow(() -> new RuntimeException("Customer not found"));
//    }
//
//    @Override
//    public List<Customers> getAllCustomers() {
//        return customersRepository.findAll();
//    }
//
//    @Override
//    public Customers updateCustomer(Long id, Customers updated) {
//        Customers existing = getCustomerById(id);
//        existing.setFirstName(updated.getFirstName());
//        existing.setEmail(updated.getEmail());
//        existing.setPhoneNumber(updated.getPhoneNumber());
//        existing.setAddress(updated.getAddress());
//        return customersRepository.save(existing);
//    }
//
//    @Override
//    public void deleteCustomer(Long id) {
//        customersRepository.deleteById(id);
//    }
//}
//
//
