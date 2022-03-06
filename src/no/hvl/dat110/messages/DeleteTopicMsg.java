package no.hvl.dat110.messages;

import static no.hvl.dat110.messages.MessageType.DELETETOPIC;

public class DeleteTopicMsg extends Message {

	// message sent from client to create topic on the broker

    private String topic;

    public DeleteTopicMsg(String user, String topic) {
        super(DELETETOPIC, user);
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
        return "DeleteTopicMsg " + super.toString() + " topic=" + topic;
    }

}
