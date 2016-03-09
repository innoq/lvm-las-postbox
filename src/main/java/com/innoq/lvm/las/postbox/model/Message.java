package com.innoq.lvm.las.postbox.model;

/**
 * Created by mjansing on 09/03/16.
 */
public class Message {
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
