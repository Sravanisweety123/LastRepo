package com.ty;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	
	
	@RequestMapping("index")
	@ResponseBody
	String display() {
		  return " <h1>Hello Springboot Application</h1> ";
	}
	
	
	@RequestMapping("home")
	@ResponseBody
	String display2() {
		System.out.println("\" hello word...\"");
		  return " <h1 style=\"color:red\">Hello Springboot Application</h1> ";
	}

}
