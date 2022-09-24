package com.example.demo.service;
//import org.springframework.data.repository.query.Param;

import com.example.demo.entity.crop;

public interface ICropService {


	crop addCrop(crop C1);
	crop updateCrop(int cropId,crop C1);
	void deleteCrop(int cropId);
}
