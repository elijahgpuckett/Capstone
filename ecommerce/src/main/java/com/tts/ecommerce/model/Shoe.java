package com.tts.ecommerce.model;


import javax.persistence.*;

@Entity
@Table(name = "shoe")
public class Shoe {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "brand")
	private String brand;
	
	@Column(name = "price")
	private String price;

	@Column(name = "size")
	private String size;

	// @Column(name = "picByte", length = 1000)
	// private byte[] picByte;

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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
    }
    
    public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	// public byte[] getPicByte() {
	// 	return picByte;
	// }

	// public void setPicByte(byte[] picByte) {
	// 	this.picByte = picByte;
	// }

	

}