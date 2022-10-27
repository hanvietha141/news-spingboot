package com.laptrinhjavaweb.api;

import com.laptrinhjavaweb.service.INewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.laptrinhjavaweb.dto.NewDTO;

@CrossOrigin
@RestController
public class NewAPI {

	@Autowired
	private INewService newService;

	@PostMapping(value = "/new")
	public NewDTO createNew(@RequestBody NewDTO model) {
		return newService.save(model);
	}
	
	@PutMapping(value="/new")
	public NewDTO updateNew(@RequestBody NewDTO model) {
		return model;
	}
	
	@DeleteMapping(value="/new")
	public void deleteNew(@RequestBody long[] ids) {
		
	}
	
	@GetMapping(value="/new")
	public NewDTO getNews(@RequestBody NewDTO model) {
		return model;
	}
	

	@GetMapping("/test")
	public String testAPI() {
		return "ase1";
	}

}
