package com.s2p.FCT.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.s2p.FCT.entity.AddInventory;
import com.s2p.FCT.services.AddInventoryService;
@CrossOrigin(origins = "*")
@RestController
public class AddInventoryController {
	 @Autowired

	 private AddInventoryService addInventoryService;

	    @PostMapping("/add")
	    public ResponseEntity<?> addProduct(
	        @RequestPart("AddInventory") AddInventory addInventory,
	        @RequestPart("images") List<MultipartFile> images
	    ) {
	        try {
	        	AddInventory saved = addInventoryService.saveProductWithImages(addInventory, images);
	            return ResponseEntity.ok(saved);
	        } catch (IOException e) {
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error saving product");
	        }
	    }
	}
