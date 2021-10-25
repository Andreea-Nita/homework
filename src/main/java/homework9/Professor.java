package homework9;

import java.util.ArrayList;
import java.util.List;

public class Professor{
    private int id;
    private String name;
    List<Course> coursesListP;

    public Professor(int id, String name) {
        this.id = id;
        this.name = name;
        coursesListP=new ArrayList<Course>();
    }

    public void addCourse(Course...args){
        for (Course c:args){
            coursesListP.add(c);
        }
    }

    /*public void addCourse(Course course){
        coursesListP.add(course);
    }*/

    public List<Course> getCourses(){
        List<Course> list=new ArrayList<>();
        list.addAll(coursesListP);
        return list;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", coursesListP=" + coursesListP +
                '}';
    }
}
