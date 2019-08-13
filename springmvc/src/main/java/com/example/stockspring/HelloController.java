package com.example.stockspring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping(path="/hello")
	public String sayHello(){
		System.out.println("hello");
		return "helloWorld";
	}
	
	@RequestMapping(value="/values0")
	public ModelAndView getEmployeeList0(){
		System.out.println("inside abc");
		ModelAndView mv=new ModelAndView(); 
		mv.setViewName("abc");
		mv.addObject("messaage", "welcome to first example of forwarding message");
		mv.addObject("messaage1", "this is message 1");
		
		return mv;
	}
	
	
	
	
	
	
	
	
}
