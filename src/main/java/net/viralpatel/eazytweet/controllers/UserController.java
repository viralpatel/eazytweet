package net.viralpatel.eazytweet.controllers;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.viralpatel.eazytweet.models.User;
import net.viralpatel.eazytweet.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/create-user.htm", method = RequestMethod.POST)
	public String create(String username, 
						String password, 
						HttpSession session) {
		
		User user = userService.create(username, password);
		
		session.setAttribute("userid", user.getId());
		session.setAttribute("username", username);
		return "redirect:user-home.htm";
	}

	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(String username, 
						String password, 
						HttpSession session,
						HttpServletResponse response) {
		
		User user = userService.findByName(username);
		if(null == user) {
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		}
		
		session.setAttribute("userid", user.getId());
		
		return "redirect:user-home.htm";
	}
	
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		
		session.removeAttribute("userid");
		
		return "success";
	}
	
	
}
