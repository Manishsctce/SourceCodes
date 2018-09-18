package com.newjava4world;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
	@Autowired
	Employee emp1;
	
	@RequestMapping(value="/hello")
	public String getDefault(@RequestParam String name){
		
		System.out.println("Hellow request");
		System.out.println(emp1.getName());
		return "hello";
	}
}
