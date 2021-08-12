package homework10;

import com.sun.source.doctree.SeeTree;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.TreeSet;

public class StudentRepository {
    private TreeSet<Student> students=new TreeSet<>();

    public void addStudent(Student student){
        students.add(student);
    }

    public void deleteStudent(int id) throws Exception{
        if (id>0) {
            for (Student s : students) {
                if (s.getId() == id) {
                    students.remove(s);
                    break;
                }
            }
        } else{
            throw new Exception("id invalid");
        }
    }

    public void studentsWithAge(int age ) throws IllegalArgumentException {
        if (age>=0){
            for (Student s: students ){
                if (s.getAge(s)==age){
                    System.out.println(s.toString()+"\n");
                }
            }
        } else {
            throw  new IllegalArgumentException("Doar numere pozitive");
        }
    }

    public ArrayList<Student> studentsByLastName () {
        ArrayList<Student> studentByLastName=new ArrayList<>(students);
        studentByLastName.sort(new SortByLastName());
        return studentByLastName;

    }

    public ArrayList<Student> studentsByBirthDate () {
        ArrayList<Student> studentByBirthDate=new ArrayList<>(students);
        studentByBirthDate.sort(new SortByBirthDate());
        return studentByBirthDate;
    }

}

