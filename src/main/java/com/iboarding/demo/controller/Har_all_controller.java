package com.iboarding.demo.controller;

import java.io.IOException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.iboarding.demo.model.*;
import com.iboarding.demo.repository.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Har_all_controller {
	
	@Autowired
	private DocRepository docRepo;

	
	@Autowired
	private Doclistrepository  doclistrepo;
	   

	@Autowired
	private Doclistpkgrepository doclistpkgrepo;
	
	static int id=0,id1=0,id2=0,id3=0;
	
	
	@Autowired
	private Productfeesrepository productfeerepo;
	
	
	
	
	@Autowired
	private Storedoclistrepository storedoclistrepo;	
	
	
	@Autowired
	private Storedocrepository  storedocsrepo;
	
//	@Autowired
	//private  productfees productfees;
	
	
	@GetMapping("/getdoclist")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Doclistpkg> getdoclist(@RequestParam int pkgid )  {
id++;


		System.out.println();
		 System.out.println();
		 System.out.println();
		if(id==1) {	
			doclistrepo.deleteAll();
			doclistpkgrepo.deleteAll();
			doclistpkgrepo.save(new Doclistpkg(1,1,1,"Pan"));
			doclistpkgrepo.save(new Doclistpkg(2,1,2,"Aadhar"));
			doclistpkgrepo.save(new Doclistpkg(3,2,1,"Pan"));
			doclistpkgrepo.save(new Doclistpkg(4,2,2,"Aadhar"));
			doclistpkgrepo.save(new Doclistpkg(5,2,3,"Form 16"));
			doclistpkgrepo.save(new Doclistpkg(6,3,1,"Pan"));
			doclistpkgrepo.save(new Doclistpkg(7,3,2,"Aadhar"));
			doclistpkgrepo.save(new Doclistpkg(8,3,4,"Drivers Licence"));



			
doclistrepo.save( new Doclist(1,"Pan") );
 doclistrepo.save( new Doclist(2,"Aadhar") );
	 doclistrepo.save( new Doclist(3,"Form 16") );
	 doclistrepo.save( new Doclist(4,"Drivers Licence") );

		 	}   
		
		
		 System.out.println(doclistrepo.findAll().toString());
		 
		return  doclistpkgrepo.findBypkgid(pkgid);
	}
	
	
	
	@GetMapping("/getproductfees")
	@CrossOrigin(origins="http://localhost:4200")
	public List<Productfees> getproductfees(@RequestParam int pkg_id){
		System.out.println(pkg_id);
		return productfeerepo.findFeesById(pkg_id); 
	}
	
	
	
	@GetMapping("/getstoredoclist")
	@CrossOrigin(origins="http://localhost:4200")
	public List<Storedoclist> getstoredoclist(){
		
		id3++;
		if(id3==1) {
			storedoclistrepo.deleteAll();
			
			Storedoclist s= new Storedoclist(1,"Merchant Store Photo");
		storedoclistrepo.save( s );
	storedoclistrepo.save( new Storedoclist(  2 ,"Merchant Utility Bill") );
			storedoclistrepo.save( new Storedoclist(  3 ,"Merchant Proformatted Letter") );
			System.out.println("inside if_________");

		}
		
		System.out.println(storedoclistrepo.findAll());

		return storedoclistrepo.findAll();    
	}
	

	
	


	   
	static int i=0;
	      static int mid=1;
	
	@PostMapping("/storedocs")
	@CrossOrigin(origins = "http://localhost:4200")
	public String uplaodImage(@RequestParam("imageFile") MultipartFile file, @RequestParam String type) throws IOException {
id++;
		System.out.println("Original Image Byte Size - " + file.getBytes().length);
		 System.out.println(file.getContentType());  
		 System.out.println(storedocsrepo.findAll().toString());
		 System.out.println(file.getOriginalFilename());
		 System.out.println(id);

		if(id==1) {	   
			storedocsrepo.deleteAll();  
		}   
		System.out.println(id+" "+mid+ " "+type+"  "+file.getOriginalFilename());
		Storedocs img = new Storedocs(mid, type, file.getBytes(),file.getOriginalFilename());
		storedocsrepo.save(img);
		Date date=java.util.Calendar.getInstance().getTime();
		 System.out.println("--------------------------------doc data --------------------");
System.out.println(id);
		 System.out.println(storedocsrepo.findAll().toString()+"at time "+date);
		 System.out.println("--------------------------------doc data--------------------");


		return "200";
	}
	
	
	@GetMapping("/deletestoredocs")
	@CrossOrigin(origins = "http://localhost:4200")
	@Transactional
	public String deleteuplaodImage(@RequestParam int mid, @RequestParam String type) {
		System.out.println(mid+" "+type);
	List	<Storedocs> doc =storedocsrepo.deleteByMidAndDoctype(mid, type);
		return "deleted";
	}
	
	
	
	
}