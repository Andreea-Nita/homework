

import java.awt.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Phone {
    private int batteryLife = 50;
    private Color color;
    private String material;
    private String imei;
    private List<Call> calls = new ArrayList<>();
    private List<Contact> contacts = new ArrayList<>();
    private List<Message> sentMessages = new ArrayList<>();

    public void setColor(Color color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Color getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public abstract String getImei();

    public void addContact(String id, String name, String phoneNumber) {
        contacts.add(new Contact(id, name, phoneNumber));
    }

    public void listContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public void sendMessage(String phoneNumber, String messageContent) {
        if (batteryLife > 0) {
            if (messageContent.length() < 500) {
                System.out.println("Mesajul: " + messageContent + " a fost trimis catre " + phoneNumber);
                sentMessages.add(new Message(phoneNumber, messageContent));
                batteryLife -= 1;
            } else {
                System.out.println("Numar de caractere depasit");
            }
        } else {
            System.out.println("Baterie descarcata");
        }
    }

    public void listMessages(String phoneNumber) {
        for (Message message : sentMessages) {
            if (message.getReceiverPhoneNumber().equals(phoneNumber)) {
                System.out.println(message.toString());
            }
        }
    }

    public void makeACall(String phoneNumver) {
        if (batteryLife > 0) {
            calls.add(new Call(LocalDateTime.now(), phoneNumver));
            System.out.println("Apel catre: " + phoneNumver);
            batteryLife -= 2;
        } else {
            System.out.println("Baterie descarcata");
        }

    }

    public void listCallHystory() {
        for (Call call : calls) {
            System.out.println(call.toString());
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "batteryLife=" + batteryLife +
                ", color=" + color +
                ", material='" + material + '\'' +
                ", imei='" + imei + '\'' +
                ", calls=" + calls +
                ", contacts=" + contacts +
                ", sentMessages=" + sentMessages +
                '}';
    }
}
