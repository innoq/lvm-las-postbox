package com.innoq.lvm.las.postbox;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

/**
 * Created by mjansing on 08/03/16.
 */
@Controller
public class PostboxController {
    @RequestMapping("/m50000/messages/")
    public ModelAndView index() {
		ArrayList<Message> messages = new ArrayList();
		messages.add(new Message("16.03.2015", "Wiedervorlage", "Vers 987654321", "http://localhost:8080/vertrag/987654321"));
		messages.add(new Message("20.03.2015", "UB-Vorlage", "", ""));
        return new ModelAndView("index", "messages", messages);
    }

	private static class Message {
		private final String date;
		private final String text;
		private final String referenceText;
		private final String referenceUri;

		public Message(String date, String text, String referenceText, String referenceUri) {
			this.date = date;
			this.text = text;
			this.referenceText = referenceText;
			this.referenceUri = referenceUri;
		}

		public String getDate() {
			return date;
		}

		public String getText() {
			return text;
		}

		public String getReferenceText() {
			return referenceText;
		}

		public String getReferenceUri() {
			return referenceUri;
		}
	}

}
