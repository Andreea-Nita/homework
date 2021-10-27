package homework11;

import java.util.ArrayList;
import java.util.List;

public class Hobby {
    private String name;
    private int frequency;
    List<Adress> adresses;

    public Hobby(String name, int frequency, List<Adress> adresses) {
        this.name = name;
        this.frequency = frequency;
        this.adresses=adresses;
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    public List<Adress> getAdresses() {
        List<Adress> buff=new ArrayList<Adress>();
        buff.addAll(adresses);
        return buff;
    }
}
