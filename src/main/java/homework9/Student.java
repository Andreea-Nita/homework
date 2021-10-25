package homework9;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    List<Course> coursesListS;

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        coursesListS = new ArrayList<Course>();
    }

    public String getName() {
        return firstName+" "+lastName;
    }

    public void addCourse(Course course){
        coursesListS.add(course);
    }

    public List<Course> getCourses(){
        List<Course> list=new ArrayList<>();
        list.addAll(coursesListS);
        return list;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", coursesListS=" + coursesListS +
                '}';
    }
}
