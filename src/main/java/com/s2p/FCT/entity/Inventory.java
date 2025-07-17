package com.s2p.FCT.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Inventory {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String category;
    private Double price;
    private Integer quantity;
    private String ageGroup;
    private String facebook;
    private String amazon;
    private String meesho;
    private String youtube;
    private String mrp;
    private String tax;
    private String aboutItem1;
    private String aboutItem2;
    private String aboutItem3;
    private String aboutItem4;
    private String aboutItem5;
    private String Brand;
    private String ToyFigureType;
    private String characteroftoy;
    private String ModelName;
    private String ModelNumber;
    private String Manufacturer;
    private String Theme;
    private String Colour;
    private String Occasion;
    private String Material;
    private String AdditionalFeatures;
    private String AreBatteriesRequired;
    private String status;
    
    



	// Store image URLs or paths as comma-separated
    @Column(length = 1000)
    private String imagePaths;
    
    
    
    
    

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getAgeGroup() {
		return ageGroup;
	}

	public void setAgeGroup(String ageGroup) {
		this.ageGroup = ageGroup;
	}



	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getAmazon() {
		return amazon;
	}

	public void setAmazon(String amazon) {
		this.amazon = amazon;
	}

	public String getMeesho() {
		return meesho;
	}

	public void setMeesho(String meesho) {
		this.meesho = meesho;
	}

	public String getYoutube() {
		return youtube;
	}

	public void setYoutube(String youtube) {
		this.youtube = youtube;
	}

	public String getMrp() {
		return mrp;
	}

	public void setMrp(String mrp) {
		this.mrp = mrp;
	}

	public String getTax() {
		return tax;
	}

	public void setTax(String tax) {
		this.tax = tax;
	}

	public String getAboutItem1() {
		return aboutItem1;
	}

	public void setAboutItem1(String aboutItem1) {
		this.aboutItem1 = aboutItem1;
	}

	public String getAboutItem2() {
		return aboutItem2;
	}

	public void setAboutItem2(String aboutItem2) {
		this.aboutItem2 = aboutItem2;
	}

	public String getAboutItem3() {
		return aboutItem3;
	}

	public void setAboutItem3(String aboutItem3) {
		this.aboutItem3 = aboutItem3;
	}

	public String getAboutItem4() {
		return aboutItem4;
	}

	public void setAboutItem4(String aboutItem4) {
		this.aboutItem4 = aboutItem4;
	}

	public String getAboutItem5() {
		return aboutItem5;
	}

	public void setAboutItem5(String aboutItem5) {
		this.aboutItem5 = aboutItem5;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public String getToyFigureType() {
		return ToyFigureType;
	}

	public void setToyFigureType(String toyFigureType) {
		ToyFigureType = toyFigureType;
	}

	public String getcharacteroftoy() {
		return characteroftoy;
	}

	public void setcharacteroftoy(String character) {
		this.characteroftoy = character;
	}

	public String getModelName() {
		return ModelName;
	}

	public void setModelName(String modelName) {
		ModelName = modelName;
	}

	public String getModelNumber() {
		return ModelNumber;
	}

	public void setModelNumber(String modelNumber) {
		ModelNumber = modelNumber;
	}

	public String getManufacturer() {
		return Manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}

	public String getTheme() {
		return Theme;
	}

	public void setTheme(String theme) {
		Theme = theme;
	}

	public String getColour() {
		return Colour;
	}

	public void setColour(String colour) {
		Colour = colour;
	}

	public String getOccasion() {
		return Occasion;
	}

	public void setOccasion(String occasion) {
		Occasion = occasion;
	}

	public String getMaterial() {
		return Material;
	}

	public void setMaterial(String material) {
		Material = material;
	}

	public String getAdditionalFeatures() {
		return AdditionalFeatures;
	}

	public void setAdditionalFeatures(String additionalFeatures) {
		AdditionalFeatures = additionalFeatures;
	}

	public String getAreBatteriesRequired() {
		return AreBatteriesRequired;
	}

	public void setAreBatteriesRequired(String areBatteriesRequired) {
		AreBatteriesRequired = areBatteriesRequired;
	}
    public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
    
	
	public String getImagePaths() {
		return imagePaths;
	}

	public void setImagePaths(String imagePaths) {
		this.imagePaths = imagePaths;
	}
	
	
    

    // Getters and setters
}
	

