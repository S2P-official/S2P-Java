package com.s2p.FCT.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.s2p.FCT.entity.AddInventory;
import com.s2p.FCT.repositories.AddInventoryRepository;

import jakarta.persistence.criteria.Path;


@Service
public class AddInventoryService {
	
	@Autowired
    private AddInventoryRepository addInventoryRepository;

    public AddInventory saveProductWithImages(AddInventory product, List<MultipartFile> images) throws IOException {
        List<String> imagePaths = new ArrayList<>();

        for (MultipartFile image : images) {
            String fileName = UUID.randomUUID() + "_" + image.getOriginalFilename();
            java.nio.file.Path uploadPath = Paths.get("uploads");

            if (!Files.exists(uploadPath)) {
                Files.createDirectories(uploadPath);
            }

            java.nio.file.Path filePath = uploadPath.resolve(fileName);
            Files.copy(image.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);

            imagePaths.add("/uploads/" + fileName); // relative path to serve
        }

        product.setImagePaths(String.join(",", imagePaths)); // save as comma-separated string
        return addInventoryRepository.save(product);
    }

}
