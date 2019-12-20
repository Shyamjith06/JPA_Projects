package com.mindtree.comics.controller.handler;

import java.util.LinkedHashMap;
import java.util.Map;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.mindtree.comics.controller.ComicsController;
import com.mindtree.comics.controller.PowerController;
import com.mindtree.comics.exception.ServiceException;

@RestControllerAdvice(assignableTypes= {ComicsController.class,PowerController.class} )
public class ControllerExceptionHandler {

	@ExceptionHandler(ServiceException.class)
	public ResponseEntity<Map<String, Object>> serviceExceptionHandler(Exception e,Throwable cause)
	{
		Map<String, Object> response = new LinkedHashMap<>();
		response.put("header", "comics");
		response.put("Error", true);
		response.put("body", e.getMessage());
		response.put("HttpStatus", HttpStatus.NOT_FOUND);
		return new ResponseEntity<Map<String,Object>>(response,HttpStatus.NOT_FOUND);
		
	}
}
