package com.mindtree.comics.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.comics.apiconfig.ApiResponse;
import com.mindtree.comics.dto.ComicsDto;
import com.mindtree.comics.service.ComicsService;

@RestController

public class ComicsController {
	
	@Autowired ComicsService comicsService;
	@PostMapping("addcomics")
	public ResponseEntity<Map<String, Object>> addComics(@RequestBody ComicsDto comicsDto)
	{
		
		Map<String,Object> response=new LinkedHashMap<String,Object>();
		response.put("header", "comics");
		response.put("Error", false);
		response.put("body", comicsService.addComics(comicsDto));
		return new ResponseEntity<Map<String, Object>>(response,HttpStatus.OK);
		
	
		}
	

}
