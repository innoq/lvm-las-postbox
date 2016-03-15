package com.innoq.lvm.las.postbox.controller;

import com.innoq.lvm.las.postbox.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by mjansing on 08/03/16.
 */
@Controller
@CrossOrigin
@RequestMapping("/m50000")
public class MessagesController {

	@RequestMapping(path = "/messages", method = RequestMethod.GET)
	public ModelAndView index() {
		Message[] messages = getMessagesFromService();
		return new ModelAndView("messages/index", "messages", messages);
	}

	private Message[] getMessagesFromService() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject("http://localhost:5100/briefkasten/m50000/", Message[].class);
	}
}
