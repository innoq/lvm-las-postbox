package com.innoq.lvm.las.postbox.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by mjansing on 09/03/16.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Message {
	@JsonProperty("entryId") // explicit json mapping
	private int entryId;

	@JsonProperty("entryURI") // explicit json mapping
	private String entryUri;

	@JsonProperty("datum")
	private String date;

	@JsonProperty("text") // explicit json mapping
	private String text;

	@JsonProperty("bezug")
	private String reference;

	@JsonProperty("bezugId")
	private String referenceId;

	@JsonProperty("bezugsUri")
	private String referenceUri;

	public int getEntryId() {
		return entryId;
	}

	public void setEntryId(int entryId) {
		this.entryId = entryId;
	}

	public String getEntryUri() {
		return entryUri;
	}

	public void setEntryUri(String entryUri) {
		this.entryUri = entryUri;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	public String getReferenceUri() {
		return referenceUri;
	}

	public void setReferenceUri(String referenceUri) {
		this.referenceUri = referenceUri;
	}

	@Override
	public String toString() {
		return "Message{" +
			"entryId=" + entryId +
			", entryUri='" + entryUri + '\'' +
			", date='" + date + '\'' +
			", text='" + text + '\'' +
			", reference='" + reference + '\'' +
			", referenceId='" + referenceId + '\'' +
			", referenceUri='" + referenceUri + '\'' +
			'}';
	}
}
