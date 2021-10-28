package homework12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class AthleteTest {

    @Test
    void readCSVWorks() {
        List<Athlete> athletes=new ArrayList<>();
        String athlet="";
        try {
            athletes = Athlete.readCSV(Paths.get("src/main/java/homework12/biathlon.csv"));
            athletes.sort(new AthleteComparator());
            for (Athlete a:athletes){
                athlet=a.getAthleteName();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        Assertions.assertTrue(athlet!=null);
        Assertions.assertEquals("Umar Jorgson",athlet);
    }
}