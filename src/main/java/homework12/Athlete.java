package homework12;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Athlete {
    private int athleteNumber;
    private String AthleteName;
    private String countryCode;
    private Integer skiTimeResult;
    private String firstShoting;
    private String secondShoting;
    private String thirdShoting;

    public Athlete(int athleteNumber, String athleteName,
                   String countryCode, Integer skiTimeResult,
                   String firstShoting, String secondShoting,
                   String thirdShoting) {
        this.athleteNumber = athleteNumber;
        AthleteName = athleteName;
        this.countryCode = countryCode;
        this.skiTimeResult = skiTimeResult;
        this.firstShoting = firstShoting;
        this.secondShoting = secondShoting;
        this.thirdShoting = thirdShoting;
    }

    public static List<Athlete>  readCSV(Path path) throws Exception{
        List<Athlete> athletes=new ArrayList<>();
        try(BufferedReader br = Files.newBufferedReader(
                path, StandardCharsets.US_ASCII)){;
            String line=br.readLine();
            while (line!=null){
                String[] s =line.split(",");
                athletes.add(Athlete.createAthlete(s));
                line = br.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return athletes;
    }

    public static Athlete createAthlete(String[] s) throws Exception{
        try {
            int number = Integer.parseInt(s[0]);
            String name = s[1];
            String code = s[2];
            Integer skiTime = (Integer.parseInt(s[3].substring(0, 2))) * 60 + Integer.parseInt(s[3].substring(3, 5));
            String shoting1 = s[4];
            String shoting2 = s[5];
            String shoting3 = s[6];
            return new Athlete(number, name, code,skiTime,shoting1,shoting2, shoting3);
        }catch (Exception e){
            throw new Exception ("can not create the athlete");
        }
    }

    public int missedShots(String shoting){
        int count=0;
        for(int i=0; i<shoting.length(); i++){
            if (shoting.charAt(i)=='o'){
                count++;
            }
        }
        return count;
    }

    public Integer getFinalResults(){
        return skiTimeResult+(missedShots(firstShoting)+missedShots(secondShoting)+missedShots(thirdShoting))*10;
    }

    public String getAthleteName() {
        return AthleteName;
    }
}
