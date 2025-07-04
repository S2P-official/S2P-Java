package com.s2p.FCT.controllers;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.s2p.FCT.entity.AddInventory;
import com.s2p.FCT.services.AddInventoryService;

@CrossOrigin(origins = "*")
@RestController
public class AddInventoryController {

    @Autowired
    private AddInventoryService addInventoryService;

    @Autowired
    private ObjectMapper objectMapper; // Needed to convert JSON string to object

    @PostMapping("/add")
    public ResponseEntity<?> addProduct(
        @RequestPart("AddInventory") String addInventoryJson, // <-- Accept as String
        @RequestPart("images") List<MultipartFile> images
    ) {
        try {
            // Convert the JSON string to an AddInventory object
            AddInventory addInventory = objectMapper.readValue(addInventoryJson, AddInventory.class);

            // Save to DB
            AddInventory saved = addInventoryService.saveProductWithImages(addInventory, images);
            return ResponseEntity.ok(saved);

        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error saving product");
        }
    }
    
    @GetMapping("/products")
    public ResponseEntity<List<AddInventory>> getAllProducts() {
        List<AddInventory> products = addInventoryService.getAllProducts();
        return ResponseEntity.ok(products);
    }
}
