package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
		
	@RequestMapping(value="/greeting")
	public String sayHello(Model model) {
		System.out.println("before");
		model.addAttribute("greeting", "Hello");  //key value  hashmap
		System.out.println("after");
		return "hello";
	}

}
