package homework9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        University ucv=new University();

        Course matematica=new Course("matematica");
        Course economie=new Course("economie");
        Course engleza=new Course("engleza");
        Course franceza=new Course("franceza");
        ucv.coursesList.add(matematica);
        ucv.coursesList.add(economie);
        ucv.coursesList.add(engleza);
        ucv.coursesList.add(franceza);

        Student s1=new Student(1,"Ionescu", "Andrei");
        Student s2=new Student(2,"Ivan","Ana");
        Student s3=new Student(3,"Popescu","Marian");
        s1.addCourse(matematica);
        s1.addCourse(franceza);
        s1.addCourse(economie);
        s2.addCourse(matematica);
        s3.addCourse(economie);
        s3.addCourse(engleza);
        s3.addCourse(franceza);
        ucv.studentsList.add(s1);
        ucv.studentsList.add(s2);
        ucv.studentsList.add(s3);

        Professor p1=new Professor(1,"Popescu");
        Professor p2=new Professor(2,"Ionescu");
        Professor p3=new Professor(3,"Cretan");
        p1.addCourse(engleza,franceza);
        p2.addCourse(economie,engleza);
        p3.addCourse(matematica);
        ucv.professorsList.add(p1);
        ucv.professorsList.add(p2);
        ucv.professorsList.add(p3);

        ucv.getProfessors();
        ucv.courseStudents(economie);
    }
}
