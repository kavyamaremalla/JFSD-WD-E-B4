package com.spring.mvc.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
@RequestMapping("/")
	public String display()
	{
		return "index";
	}	
}
