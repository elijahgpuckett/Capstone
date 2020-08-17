package com.tts.ecommerce.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.tts.ecommerce.db.ShoeRepository;
import com.tts.ecommerce.model.Shoe;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "shoes")
public class ShoeController {

	private byte[] bytes;
	
    @Autowired
	private ShoeRepository shoeRepository;
	
	
	@GetMapping("/get")
	public List<Shoe> getShoes() {
		return shoeRepository.findAll();
	}

	@PostMapping("/upload")
	public void uploadImage(@RequestParam("imageFile") MultipartFile file) throws IOException {
		this.bytes = file.getBytes();
	}

	@PostMapping("/add")
	public void createShoe(@RequestBody Shoe shoe) throws IOException {
		//shoe.setPicByte(this.bytes);//
		shoeRepository.save(shoe);
		// this.bytes = null;//
	}

	@PutMapping("/update")
	public void updateShoe(@RequestBody Shoe shoe) {
		shoeRepository.save(shoe);
	}

	@DeleteMapping( path = { "/{id}" })
	public Shoe deleteShoe(@PathVariable("id") long id) {
		Shoe shoe = shoeRepository.getOne(id);
		shoeRepository.deleteById(id);
		return shoe;
	}

}