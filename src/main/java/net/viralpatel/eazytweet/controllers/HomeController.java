package net.viralpatel.eazytweet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home.htm")
	public String getLogin(){
		
		return "login";
	}
	
	@RequestMapping("/user-home.htm")
	public String getHome(){
		
		return "index";
	}
	
}
