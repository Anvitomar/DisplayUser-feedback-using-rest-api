package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.feedback;
import com.dao.feedbackDao;

@Service
public class feedbackService {
	@Autowired
	feedbackDao feedbackdao;
	
	public String storefeedback(feedback feed) {
		if(feedbackdao.storefeedback(feed)>0) {
			return "Thankyou.....Your Feedback stored successfuly";
		}else {
			return"Please try again to store a feedback";
		}
	}
public List<feedback> getAllfeedback(){
	return feedbackdao.getfeedbackdetails();
}
}
