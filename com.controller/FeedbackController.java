package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.bean.feedback;
import com.service.feedbackService;

@RestController
public class FeedbackController {
   @Autowired
   feedbackService feedbackservice;
 //http://localhost:8080/storeFeedback
	@RequestMapping(value="storeFeedback",consumes=MediaType.APPLICATION_JSON_VALUE,method=RequestMethod.POST)
	public String storeFeedback(@RequestBody feedback feed) {                   
		return feedbackservice.storefeedback(feed);
	}
	//http://localhost:8080/viewFeedback
	@RequestMapping(value="viewFeedback",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<feedback> viewAllFeedbackd() {
	return feedbackservice.getAllfeedback();
}
	//http://localhost:8080/htmlfeedback
	@RequestMapping(value="htmlfeedback",method=RequestMethod.GET,produces=MediaType.TEXT_HTML_VALUE)
	public String sayHTML() {
		return"<h2>Confirmation page after storing feedback in html form</h2>";
				
	}
}
