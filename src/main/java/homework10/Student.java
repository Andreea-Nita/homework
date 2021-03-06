package homework10;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.time.LocalDate;
import java.time.Period;


public class Student implements  Comparable<Student> {
    public static final Logger LOGGER= LogManager.getLogger(Student.class);

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int id;
    private Gender gender;

    public Student(String firstName, String lastName, LocalDate dateOfBirth, int id, Gender gender) throws Exception{
        try {
            setFirstName(firstName);
            setLastName(lastName);
            setDateOfBirth(dateOfBirth);
            setGender(gender);
        } catch (Exception e) {
            LOGGER.error("Student can't be created ("+e.getMessage()+")");
            throw  new Exception(e.getMessage());
        }
        this.id = id;

    }

    private void setFirstName (String firstName) throws Exception {
        if (firstName==null || firstName.equals(" ")){
            LOGGER.error("First name can't be empty");
            throw new Exception("Nu ati introdus prenumele");
        } else {
            this.firstName = firstName;
        }
    }

    private void setLastName(String lastName) throws Exception {
        if (lastName==null || lastName.equals(" ")){
            LOGGER.error("Last name can't be empty");
            throw new Exception("Nu ati introdus numele");
        } else {
            this.lastName = lastName;
        }
    }

    private void setDateOfBirth(LocalDate dateOfBirth) throws Exception {
        if (dateOfBirth==null || dateOfBirth.getYear()<1900 || dateOfBirth.getYear()>LocalDate.now().getYear()-18) {
            LOGGER.error("Date of birth not between 1900 and current year - 18");
            throw new Exception("Data invalida");
        } else {
            this.dateOfBirth = dateOfBirth;
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    private void setGender(Gender gender) throws Exception {
        Gender g=Gender.lookup(gender);
        if (g==null){
            LOGGER.error("Invalid gender");
            throw new Exception("Invalid gender");
        } else {
            this.gender = gender;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge(Student student){
        return (Period.between(student.getDateOfBirth(), LocalDate.now())).getYears();
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", id=" + id +
                ", gender=" + gender +
                '}';
    }


    @Override
    public int compareTo( Student o) {
        return this.id-o.getId();
    }
}
