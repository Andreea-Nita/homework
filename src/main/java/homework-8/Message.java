

public class Message {
    private String receiverPhoneNumber;
    private String messageContent;

    public Message(String receiverPhoneNumber, String messageContent) {
        this.receiverPhoneNumber = receiverPhoneNumber;
        this.messageContent = messageContent;
    }

    public String getReceiverPhoneNumber(){
        return receiverPhoneNumber;
    }

    @Override
    public String toString() {
        return "Message{" +
                "receiverPhoneNumber='" + receiverPhoneNumber + '\'' +
                ", messageContent='" + messageContent + '\'' +
                '}';
    }
}


