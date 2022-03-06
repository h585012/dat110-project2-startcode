package no.hvl.dat110.messages;

import static no.hvl.dat110.messages.MessageType.SUBSCRIBE;

public class SubscribeMsg extends Message {

	// message sent from client to subscribe on a topic 

    private String topic;

    public SubscribeMsg(String user, String topic) {
        super(SUBSCRIBE, user);
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "SubscribeMsg " + super.toString() + "topic= " + topic;
    }
		
}
