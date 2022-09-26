package com.example.demo.controller;



import java.text.ParseException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Supplier;
import com.example.demo.exception.SupplierNotFoundException;
import com.example.demo.service.SupplierServiceImpl;
@RestController
public class SupplierController {
	
	@Autowired
	SupplierServiceImpl suppService;
	

	@GetMapping("/test")
	ResponseEntity<List<Supplier>> getAllSupplier() {
		List<Supplier> suppliers= suppService.getAllSupplier();
		return new ResponseEntity<>(suppliers, HttpStatus.OK); // 200 ok
	}
	
	@PostMapping("/supp/add")
	ResponseEntity<Supplier> addSupplier(@RequestBody Supplier S1) {
		Supplier newsupp = suppService.addSupplier(S1);
		return new ResponseEntity<>(newsupp, HttpStatus.CREATED); // 201 created 
	}
	
	@DeleteMapping("/adv/delete/{advId}")
	ResponseEntity<Supplier> deleteSupplier(@PathVariable("supplierId") int supplierId) throws SupplierNotFoundException{
		Supplier S1 = suppService.deleteSupplier(supplierId);
		return new ResponseEntity<>(S1, HttpStatus.OK); //200 ok
	}
	
	
	

}
