package com.s2p.FCT.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.nio.file.Path;
import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.s2p.FCT.entity.AddInventory;
import com.s2p.FCT.repositories.AddInventoryRepository;

@Service
public class AddInventoryService {

    @Autowired
    private AddInventoryRepository addInventoryRepository;

    // Absolute path where you want to store images
    private final String BASE_UPLOAD_DIR = "/home/santosh/Backend/uploads";

    public AddInventory saveProductWithImages(AddInventory product, List<MultipartFile> images) throws IOException {
        List<String> imagePaths = new ArrayList<>();

        // Sanitize folder name
        String safeFolderName = product.getName().replaceAll("[^a-zA-Z0-9-_]", "_");
        Path productUploadPath = Paths.get(BASE_UPLOAD_DIR, safeFolderName);

        // Create directories if not exist
        if (!Files.exists(productUploadPath)) {
            Files.createDirectories(productUploadPath);
        }

        for (MultipartFile image : images) {
            String fileName = UUID.randomUUID() + "_" + image.getOriginalFilename();
            Path filePath = productUploadPath.resolve(fileName);
            Files.copy(image.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);

            // Store relative web path to serve later
            String webPath = "/uploads/" + safeFolderName + "/" + fileName;
            imagePaths.add(webPath);
        }

        product.setImagePaths(String.join(",", imagePaths));
        return addInventoryRepository.save(product);
    }

    public List<AddInventory> getAllProducts() {
        return addInventoryRepository.findAll();
    }
}
