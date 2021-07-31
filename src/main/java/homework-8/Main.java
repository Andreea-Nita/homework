
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Phone phone = new homework.Iphone12("12345");

        phone.setColor(Color.BLACK);
        phone.setMaterial("titanium");

        System.out.println(phone.toString());

        phone.addContact("1","Andreea","0742765439");
        phone.addContact("2","Irina","0751099677");
        phone.listContacts();

        phone.sendMessage("0751099677", "Mesajul numarul 1");
        phone.sendMessage("0751099677", "Mesajul numarul 2");
        phone.sendMessage("0751099677", "Mesajul numarul 3");
        phone.listMessages("0751099677");

        phone.makeACall("0751099677");
        phone.makeACall("0751788644");
        phone.makeACall("0751788644");
        phone.makeACall("0742765439");
        phone.listCallHystory();

        System.out.println("Baterie ramasa: "+phone.getBatteryLife()+" ore");




    }
}
