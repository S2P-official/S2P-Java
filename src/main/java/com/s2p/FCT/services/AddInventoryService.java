package com.s2p.FCT.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.nio.file.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.s2p.FCT.entity.AddInventory;
import com.s2p.FCT.repositories.AddInventoryRepository;

@Service
public class AddInventoryService {

    @Autowired
    private AddInventoryRepository addInventoryRepository;

    public AddInventory saveProductWithImages(AddInventory product, List<MultipartFile> images) throws IOException {
        List<String> imagePaths = new ArrayList<>();

        // Base upload directory
        Path baseUploadPath = Paths.get("uploads");

        // Create folder based on product name (sanitized)
        String safeFolderName = product.getName().replaceAll("[^a-zA-Z0-9-_]", "_");
        Path productUploadPath = baseUploadPath.resolve(safeFolderName);

        if (!Files.exists(productUploadPath)) {
            Files.createDirectories(productUploadPath);
        }

        for (MultipartFile image : images) {
            String fileName = UUID.randomUUID() + "_" + image.getOriginalFilename();
            Path filePath = productUploadPath.resolve(fileName);
            Files.copy(image.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);

            // Save the relative path
            imagePaths.add("/uploads/" + safeFolderName + "/" + fileName);
        }

        product.setImagePaths(String.join(",", imagePaths));
        return addInventoryRepository.save(product);
    }
}
