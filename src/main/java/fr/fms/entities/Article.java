package fr.fms.entities;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Article implements Serializable {
private static final long serialVersionUID = 1L;
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
public void setId(long id) {
	this.id = id;
}

private String description;
private String brand;
private double price;

@ManyToOne
private Category category;

public Article(long id,String description, String brand, double price,Category category) {
	this.id=id;
	this.description = description;
	this.setBrand(brand);
	this.setPrice(price);
	this.category=category;
}

public Article(String description, String brand, double price,Category category) {
	
	this.description = description;
	this.setBrand(brand);
	this.setPrice(price);
	this.category=category;
}

public Article(long id) {
	this.id=id;
}


public Article() {}






public Category getCategory() {
	return category;
}

public void setCategory(Category category) {
	this.category = category;
}

public void setDescription(String description) {
	this.description = description;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getDescription() {
	return description;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}



@Override
public String toString() {
	return "Article [id=" + id + ", description=" + description + ", brand=" + brand + ", price=" + price
			+ ", category=" + category + "]";
}

public static String centerString(String str) {
	if(str.length() >= 20) return str;
	String dest = "                    ";
	int deb = (20 - str.length())/2 ;
	String data = new StringBuilder(dest).replace( deb, deb + str.length(), str ).toString();
	return data;
}


}
