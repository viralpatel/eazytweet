package net.viralpatel.eazytweet.controllers;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.viralpatel.eazytweet.models.Tweet;
import net.viralpatel.eazytweet.services.TweetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TweetController {

	@Autowired
	private TweetService tweetService;
	
	
	@RequestMapping(value="/create-tweet.htm", method=RequestMethod.POST)
	public Tweet create(String text, HttpSession session, HttpServletResponse response) {
				
		String userId = checkSession(session, response);
		if(null == userId) return null;
		
		return tweetService.create(userId, text);
	}
	
	
	@RequestMapping(value="/list.htm", method=RequestMethod.GET)
	public List<Tweet> listByViewer(HttpSession session, HttpServletResponse response) {
		String userId = checkSession(session, response);
		if(null == userId) return null;

		return tweetService.listViewerTweet(userId);
		
	}
	
	
	private String checkSession(HttpSession session, HttpServletResponse response) {
		if(null == session) {
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			return null;
		}
		
		String userId = (String) session.getAttribute("userid");
		
		if(null == userId) {
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			return null;
		}
		
		return userId;
	}
	
}
