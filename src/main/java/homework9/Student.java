package homework9;

import java.util.ArrayList;
import java.util.List;

public class Student extends Course {
    private String name;
    private String id;
    public List<Student> students=new ArrayList<>();

    public Student (String id, String name){
        this.id=id;
        this.name=name;
    }


    public void listStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Override
    public void goToClass() {
        System.out.println("Este prezent");;
    }

    @Override
    public void learn() {
        super.learn();
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
