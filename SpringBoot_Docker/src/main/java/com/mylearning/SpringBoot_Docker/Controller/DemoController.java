package com.mylearning.SpringBoot_Docker.Controller;


import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;

@RestController
@RequestMapping("/welcome")
public class DemoController {

    @GetMapping("/{name}")
    public String welcome(@PathVariable String name){

        return "Welcome "+ name +" to the docker file tutorial !";


    }
}

