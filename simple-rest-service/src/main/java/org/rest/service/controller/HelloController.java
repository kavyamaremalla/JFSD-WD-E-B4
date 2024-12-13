package org.rest.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    @Value("${email}")
    private String email;

    @GetMapping("/welcome")
    public String sayHello(){
        //write your logic here
        return "Hello World! " + email;
    }

//    @GetMapping("/welcome/{name}")
//    @RequestMapping(method = RequestMethod.GET) ==== @GetMapping
    @RequestMapping(value = "/welcome/{name}", method = RequestMethod.GET)
    public String sayHelloWithName(@PathVariable String name){
        //write your logic here
        return "Hello " + name + " !";
    }
}
