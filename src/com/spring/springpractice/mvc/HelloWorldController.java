package com.spring.springpractice.mvc;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	// need a controller method to show the html form
	@RequestMapping("/showForm")
	public String showForm()
	{
		return "showform";
	}
	
	// need a controller method to process the form
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "processform";
	}
	
	
	// Define a controller method to read form data and
	// add data to the model
	@RequestMapping("/mapModelData")
	public String mapModelData(HttpServletRequest request, Model model)
	{
	    // read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		
		// convert the data to all caps
		theName = theName.toUpperCase();
		
		// create the message
		String result = "Yo! " + theName;
		// add message to the model
		model.addAttribute("message" , result);
		
		return "processModelData";
	}
			
	
	//
	// @RequestParam
	// @RequestParam is used to read the HTML form data provided by a
	// user and bind it to the request parameter. 
	// The Model contains the request data and provides it to view page.
	//
	@RequestMapping("/mapModelData2")
	public String mapModelData_WithAnnotation(
			@RequestParam("studentName") String theName,
			Model model)
	{
		// No need these two line of Code
	    // read the request parameter from the HTML form
		// String theName = request.getParameter("studentName");
		
		// convert the data to all caps
		theName = theName.toUpperCase();
		
		// create the message
		String result = "Hey my friend! " + theName;
		// add message to the model
		model.addAttribute("message" , result);
		
		return "processModelData";
	}
}

