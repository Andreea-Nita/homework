package homework9;

import java.util.ArrayList;
import java.util.List;

public class University {
    List<Student> studentsList;
    List<Professor> professorsList;
    List<Course> coursesList;

    public University(){
        studentsList=new ArrayList<Student>();
        professorsList=new ArrayList<Professor>();
        coursesList=new ArrayList<Course>();
    }

    public void getStudents(){
        List<Student> list=new ArrayList<>();
        list.addAll(studentsList);
        System.out.println(list);
    }

    public void getProfessors(){
        List<Professor> list=new ArrayList<>();
        list.addAll(professorsList);
        System.out.println(list);
    }

    public void getCourses(){
        List<Course> list=new ArrayList<>();
        list.addAll(coursesList);
        System.out.println(list);
    }

    public void courseStudents(Course course){
        List<String> list=new ArrayList<>();
        for (Student s:studentsList){
            if (s.getCourses().contains(course)){
                list.add(s.getName());
            }
        }
        System.out.println(list);
    }

    public void courseProfessors(Course course){
        List<Professor> list=new ArrayList<>();
        for (Professor p:professorsList){
            if (p.getCourses().contains(course)){
                list.add(p);
            }
        }
        System.out.println(list);
    }

}
