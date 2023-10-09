package com.wildcodeschool.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

@Controller
@SpringBootApplication
public class MyProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyProjectApplication.class, args);
    }

    public String[] doctorList = new String[] {"Christopher Eccleston", "David Tennant", "Matt Smith", "Peter Capaldi", "Jodie Whittaker"};

    @RequestMapping("/doctor/{incarnationNumber}")
    @ResponseBody
    public String getId(@PathVariable int incarnationNumber) {
        if(incarnationNumber >= 1 && incarnationNumber <= 8) {
            throw new ResponseStatusException(HttpStatus.SEE_OTHER, "See other resource");
        } else if(incarnationNumber >= 9 && incarnationNumber <= 13) {
            return "{\"number\": " + incarnationNumber + ", \"name\" :" + "\"" + doctorList[incarnationNumber - 9] + "\"" + "}";
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, ("Impossible to retrieve the incarnation : " + incarnationNumber));
    }
}