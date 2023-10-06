package com.wildcodeschool.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MyProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyProjectApplication.class, args);
    }

    @RequestMapping("/doctor/1")
    @ResponseBody
    public String firstDoctor() {
        return "William Hartnell";
    }

    @RequestMapping("/doctor/2")
    @ResponseBody
    public String secondDoctor() {
        return "Patrick Troughton";
    }

    @RequestMapping("/doctor/3")
    @ResponseBody
    public String thirdDoctor() {
        return "Jon Pertwee";
    }

    @RequestMapping("/doctor/4")
    @ResponseBody
    public String fourthDoctor() {
        return "Tom Baker";
    }

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "<ul><li><a href='http://localhost:8080/doctor/1'>First Doctor</a></li><li><a href='http://localhost:8080/doctor/2'>Second Doctor</a></li><li><a href='http://localhost:8080/doctor/3'>Third Doctor</a></li><li><a href='http://localhost:8080/doctor/4'>Fourth Doctor</a></li></ul>";
    }
}