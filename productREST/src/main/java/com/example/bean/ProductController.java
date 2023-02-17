package com.example.bean;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping("/products")
	public List<Product> list()
	{
		return service.listAll();
	}
	
	@GetMapping("/products/{id}")
	public ResponseEntity<Product> get(@PathVariable  Integer id)
	{
	try {
		Product product = service.get(id);
		return new ResponseEntity<Product>(product,HttpStatus.OK);
	}catch(NoSuchElementException e)
	{
		return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
	}
	}
	
	@PostMapping("/product")
	public void add(@RequestBody Product product)
	{
		service.save(product);
	}
	 
}

//https://mvnrepository.com/artifact/io.springfox/springfox-swagger2/2.9.2
//http://localhost:9095/v2/api-docs
//https://mvnrepository.com/artifact/io.springfox/springfox-swagger-ui/2.9.2
//http://localhost:9091/swagger-ui.html


