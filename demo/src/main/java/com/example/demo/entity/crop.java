package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity

public class crop {
	@Id
	@GeneratedValue
	@Column(name="CropID")
	private int CropId;
	@Column(name="CropID")
	private String CropType;
	@Column(name="CropID")
	private int quantity;
	

}
