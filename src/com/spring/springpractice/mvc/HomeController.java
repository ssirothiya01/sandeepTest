
// Video 118 and 119 need to practice.

package com.spring.springpractice.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  // Annotation for - This is an mvc controller class 
public class HomeController {

	// @Controller: 
    //  @Controller annotation is used to mark the class as the controller.
	//  @Controller annotation is an annotation used in Spring MVC framework
	//  (the component of Spring Framework used to implement Web Application).
	//  The @Controller annotation indicates that a particular class serves 
	//  the role of a controller. This class perform the business logic 
	//  (and can call the services) by its method.
	//
	// @RequestMapping: 
	//   @RequestMapping annotation is used to map web requests to specific handler 
	//   classes or handler methods. 
	//   @RequestMapping can be applied to the controller class as well as methods.
    //   @RequestMapping is one of the most common annotation used in 
    //   Spring Web applications.
	//
	@RequestMapping("/")
	public String showPage()
	{
		return "main-menu";
	}
}
