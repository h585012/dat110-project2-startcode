package no.hvl.dat110.messages;

import no.hvl.dat110.common.TODO;

import static no.hvl.dat110.messages.MessageType.PUBLISH;

public class PublishMsg extends Message {
	
	// message sent from client to create publish a message on a topic 

	private String topic;
	private String message;


	public PublishMsg(String user, String topic, String message) {
		super(PUBLISH, user);
		this.topic = topic;
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}

	public String getTopic() {
		return topic;
	}


	public void setTopic(String topic) {
		this.topic = topic;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	@Override
	public String toString() {
		return "PublishMsg " + super.toString() + "topic= " + topic + "message= " + message;
	}
}
