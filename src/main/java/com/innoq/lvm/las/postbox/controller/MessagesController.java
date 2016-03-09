package com.innoq.lvm.las.postbox.controller;

import com.innoq.lvm.las.postbox.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

/**
 * Created by mjansing on 08/03/16.
 */
@Controller
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/m50000")
public class MessagesController {

	@RequestMapping(path = "/messages", method = RequestMethod.GET)
	public ModelAndView index() {
		ArrayList<Message> messages = new ArrayList();
		messages.add(new Message("16.03.2015", "Wiedervorlage", "Vers 987654321", "http://localhost:8080/vertrag/987654321"));
		messages.add(new Message("20.03.2015", "UB-Vorlage", "", ""));
		return new ModelAndView("messages/index", "messages", messages);
	}
}
