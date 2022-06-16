package com.example.demo;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class wishes {
	@GetMapping("/greeting")
	public String greeting()
	{
		return " welcome EAIESB";
	}
	
	@PostMapping("/fullname")
	public String fullname(@Validated @RequestBody request req)
	{
		return (req.getFirstName() + "" + req.getLastName());
	}
	

}
