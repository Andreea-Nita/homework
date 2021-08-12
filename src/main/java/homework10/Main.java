package homework10;

 import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

    public class Main {
        public static void main(String[] args) {
            StudentRepository studentRepository=new StudentRepository();

            Student s1=new Student("Popescu", "Ion",  LocalDate.of(1991, 6, 20), 1, Gender.M);
            studentRepository.addStudent(s1);

            Student s2=new Student("Ionescu", "Vlad", LocalDate.of(1994, 11, 13), 2 , Gender.M);
            studentRepository.addStudent(s2);

            Student s3=new Student("Vasilescu", "Maria", LocalDate.of(1994, 9,20), 3, Gender.F);
            studentRepository.addStudent(s3);

            Student s4=new Student("Marin", "Cristi", LocalDate.of(1991, 8,11), 4, Gender.M);
            studentRepository.addStudent(s4);

            try {
                studentRepository.studentsWithAge(30);
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

            StringBuilder studentsByLastName=new StringBuilder();
            for (Student student: studentRepository.studentsByLastName()){
                studentsByLastName.append(student.toString()+"\n");
            }
            System.out.println(studentsByLastName);

            StringBuilder studentsByBirthDate=new StringBuilder();
            for (Student student: studentRepository.studentsByBirthDate()){
                studentsByBirthDate.append(student.toString()+"\n");
            }
            System.out.println(studentsByBirthDate);

            try{
                studentRepository.deleteStudent(3);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }

        }
