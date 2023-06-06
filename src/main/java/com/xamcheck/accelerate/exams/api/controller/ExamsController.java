package com.xamcheck.accelerate.exams.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xamcheck.accelerate.exams.api.dto.ResponceDto;



@RestController
@RequestMapping("/exams")
public class ExamsController {
	@Value("${microservice.visor-prs-service.endpoints.endpoint.uri}")
    private String prsURL;
	@Value("${microservice.visor-master-service.endpoints.endpoint.uri}")
    private String masterURL;
	@Value("${microservice.visor-exams-service.endpoints.endpoint.uri}")
    private String examsURL;
	@Value("${microservice.visor-schoolapp-service.endpoints.endpoint.uri}")
    private String schoolRootURL;
	@Value("${microservice.visor-teacherapp-service.endpoints.endpoint.uri}")
    private String teacherRootURL;
	@Value("${microservice.visor-adminapp-service.endpoints.endpoint.uri}")
    private String adminRootURL;
	@GetMapping("/test")
	public ResponceDto test() {
		ResponceDto responceDto=new ResponceDto();
		System.out.println(prsURL+"--"+masterURL+"--"+examsURL+"--"+schoolRootURL);
		responceDto.setMessage("Just test the Exams Ends Points");
		return responceDto;
		
	}

}
