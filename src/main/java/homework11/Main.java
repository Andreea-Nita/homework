package homework11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        //creating a TreeSet with persons sorted by name
        TreeSet<Person> personsByName=new TreeSet<>(new NameComparator());
        personsByName.add(new Person("Popescu", 27));
        personsByName.add(new Person("Ionescu", 32));
        personsByName.add(new Person("Andrei", 18));

        for (Person p:personsByName){
            System.out.println("nume: "+p.getName()+", varsta:"+p.getAge());
        }

        //creating a TreeSet with persons sorted by age
        TreeSet<Person> personsByAge=new TreeSet<>(new AgeComparator());
        personsByAge.addAll(personsByName);

        for (Person p:personsByAge){
            System.out.println("nume: "+p.getName()+", varsta:"+p.getAge());
        }

        //creating an HashMap with persons and hobbies
        HashMap<Person, List<Hobby>> personHobbies=new HashMap<>();

        Adress a1=new Adress("Lacul Morii", "Bucuresti", "Romania");
        Adress a2=new Adress("Tineretului", "Bucuresti", "Romania");
        Adress a3=new Adress("Bois de Vincennes", "Paris", "France");
        Adress a4=new Adress("Via Capella", "Nocelle", "Italy");

        List<Adress> adressesForHobby1=new ArrayList<>();
        adressesForHobby1.add(a1);
        adressesForHobby1.add(a2);
        adressesForHobby1.add(a4);

        List<Adress> adressesForHobby2=new ArrayList<>();
        adressesForHobby2.add(a3);
        adressesForHobby2.add(a4);

        Hobby hobby1=new Hobby("running", 4, adressesForHobby1);
        Hobby hobby2=new Hobby("cycling", 3, adressesForHobby2);

        List<Hobby> hobbies=new ArrayList<>();
        hobbies.add(hobby1);
        hobbies.add(hobby2);

        Person person=new Person("Popescu", 27);
        personHobbies.put(person, hobbies);
        for (Hobby h: personHobbies.get(person)){
            for (Adress adr: h.getAdresses()){
                System.out.println(h.getName()+" "+adr.getCountry());
            }
        }





    }
}
