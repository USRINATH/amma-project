package com.sri.controller;


import com.sri.AmmaProjectApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectTestController {
    Logger logger= LoggerFactory.getLogger(ProjectTestController.class);


@GetMapping("/getdetails")
    public String getResponse(){
        System.out.println("Rest Controller");
    logger.info("Application RestApplication Controller ProjectTestController--->");
        return "Welcome to Rest Response";
    }
}
