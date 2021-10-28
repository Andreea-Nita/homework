package homework12;

import java.util.Comparator;

public class AthleteComparator implements Comparator<Athlete> {

    @Override
    public int compare(Athlete o1, Athlete o2) {
        return o1.getFinalResults()-o2.getFinalResults();
    }
}
