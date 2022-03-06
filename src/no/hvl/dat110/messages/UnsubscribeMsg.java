package no.hvl.dat110.messages;

import static no.hvl.dat110.messages.MessageType.UNSUBSCRIBE;

public class UnsubscribeMsg extends Message {

	// message sent from client to unsubscribe on a topic 

    private String topic;

    public UnsubscribeMsg(String user, String topic) {
        super(UNSUBSCRIBE, user);
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
        return "UnsubscribeMsg " + super.toString() + "topic= " + topic;
    }
	
}
