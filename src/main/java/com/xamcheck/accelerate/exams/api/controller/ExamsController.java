package com.xamcheck.accelerate.exams.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xamcheck.accelerate.exams.api.dto.ResponceDto;



@RestController
@RequestMapping("/exams")
public class ExamsController {
	
	@GetMapping("/test")
	public ResponceDto test() {
		ResponceDto responceDto=new ResponceDto();
		responceDto.setMessage("Just test the Exams Ends Points");
		return responceDto;
		
	}

}
