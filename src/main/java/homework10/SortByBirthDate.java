package homework10;

    import java.util.Comparator;

    public class SortByBirthDate implements Comparator<Student> {

        @Override
        public int compare(Student s1, Student s2) {
            return s1.getDateOfBirth().compareTo(s2.getDateOfBirth());
        }
}
