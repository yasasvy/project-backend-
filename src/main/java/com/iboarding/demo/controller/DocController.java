package com.iboarding.demo.controller;


import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.iboarding.demo.model.Docs;
import com.iboarding.demo.repository.DocRepository;

@RestController
public class DocController {
	
	@Autowired
	private DocRepository docRepo;

	   
	static int id=0;
	
    

	@PostMapping("/uploadFile")

	@CrossOrigin(origins = "http://localhost:4200")

	public String uplaodImage(@RequestParam("imageFile") MultipartFile file, @RequestParam String type ,@RequestParam int mid) throws IOException {

	id++;

	System.out.println("Original Image Byte Size - " + file.getBytes().length);

	System.out.println(file.getContentType());  

	System.out.println(docRepo.findAll().toString());

	System.out.println(file.getOriginalFilename());

	System.out.println(id);



	if(id==1) {      

	docRepo.deleteAll();  

	}   

	System.out.println(id+" "+mid+ " "+type+"  "+file.getOriginalFilename());

	Docs img = new Docs(mid, type, file.getBytes(),file.getOriginalFilename());

//	Docs doc =docRepo.findByMidAndDocType(mid, type);

//	System.out.println(doc);


	//update 

//	docRepo.update(doc.getDocname(),mid,type);

//	return "200";

	docRepo.save(img);




	Date date=java.util.Calendar.getInstance().getTime();

	System.out.println("--------------------------------doc data --------------------");

	System.out.println(id);

	System.out.println(docRepo.findAll().toString()+"at time "+date);

	System.out.println("--------------------------------doc data--------------------");





	return "200";

	}



	@GetMapping("/deleteuploadfile")

	@CrossOrigin(origins = "http://localhost:4200")

	@Transactional

	public String deleteuplaodImage(@RequestParam int mid, @RequestParam String type) {

	System.out.println(mid+" "+type);

	List <Docs> doc =docRepo.deleteByMidAndDocType(mid, type);

	return "deleted";

	}



	@GetMapping("/getdocfile")

	@CrossOrigin(origins = "http://localhost:4200")

	@Transactional

	public Docs getdocfile(@RequestParam int mid, @RequestParam String type) {

	System.out.println(mid+" "+type);

	Docs doc =docRepo.findByMidAndDocType(mid, type);

//	doc.setData(null);
	

//	System.out.println(doc);

	return doc;

	}

	@GetMapping("/getalldocfile")

	@CrossOrigin(origins = "http://localhost:4200")

	@Transactional

	public List<Docs> getalldocfile() {

	List <Docs> doc =docRepo.findAll();

	for(Docs i : doc) {

	i.setData(null);



	}

	System.out.println(doc);

	return doc;

	}



	
}