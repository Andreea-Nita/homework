package homework10;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class StudentRepositoryTest {
    @Test
    void addStudent() {

        StudentRepository studentRepository=new StudentRepository();

        try{
            Student student=new Student("Ioana", "Popa",
                    LocalDate.of(1991, 6, 20),2900620, Gender.F);
            studentRepository.addStudent(student);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        assertEquals(1, studentRepository.getStudents().size());
    }

    @Test
    void deleteStudent (){
        StudentRepository studentRepository=new StudentRepository();

        try{
            Student student=new Student("Ioana", "Popa",
                    LocalDate.of(1991, 6, 20),2900620, Gender.F);
            studentRepository.addStudent(student);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            studentRepository.deleteStudent(2900620);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        assertEquals(0, studentRepository.getStudents().size());
    }

    @Test
    void firstNameNotEmpty (){
        StudentRepository studentRepository=new StudentRepository();

        try{
            Student student=new Student(" ", "Popa",
                    LocalDate.of(1991, 6, 20),2900620, Gender.F);
            studentRepository.addStudent(student);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        assertEquals(0, studentRepository.getStudents().size());

    }

    @Test
    void lastNameNotEmpty (){
        StudentRepository studentRepository=new StudentRepository();

        try{
            Student student=new Student("Ioana", " ",
                    LocalDate.of(1991, 6, 20),2900620, Gender.F);
            studentRepository.addStudent(student);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        assertEquals(0, studentRepository.getStudents().size());
    }

    @Test
    void dateOfBirth(){
        StudentRepository studentRepository=new StudentRepository();

        try{
            Student student=new Student("Ioana", "Popa",
                    LocalDate.of(1890, 6, 20),2900620, Gender.F);
            studentRepository.addStudent(student);

            Student student2=new Student("Ion", "Popa",
                    LocalDate.of(2001, 6, 20),1010620,Gender.M);
            studentRepository.addStudent(student2);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        assertEquals(0, studentRepository.getStudents().size());
    }

    @Test
    void studentsWithGivenAge(){
        int age=LocalDate.now().getYear()-1990;
        StudentRepository studentRepository=new StudentRepository();

        try{
            studentRepository.addStudent(new Student("Popescu", "Ion",  LocalDate.of(LocalDate.now().minusYears(age).getYear(), 6, 20), 1, Gender.M));
            studentRepository.addStudent(new Student("Ionescu", "Vlad", LocalDate.of(2001, 11, 13), 2 , Gender.M));
            studentRepository.addStudent(new Student("Vasilescu", "Maria", LocalDate.of(2000, 9,20), 3, Gender.F));
            studentRepository.addStudent(new Student("Marin", "Cristi", LocalDate.of(LocalDate.now().minusYears(age).getYear(), 8,11), 4, Gender.M));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            int stud=studentRepository.studentsWithAge(age).size();
            assertEquals(2, stud);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Test
    void sortedByLastName (){
        StudentRepository studentRepository=new StudentRepository();

        try{
            studentRepository.addStudent(new Student("Popescu", "c",  LocalDate.of(1991, 6, 20), 1, Gender.M));
            studentRepository.addStudent(new Student("Ionescu", "a", LocalDate.of(2001, 11, 13), 2 , Gender.M));
            studentRepository.addStudent(new Student("Vasilescu", "b", LocalDate.of(2000, 9,20), 3, Gender.F));
            studentRepository.addStudent(new Student("Marian", "d", LocalDate.of(1991, 8,11), 4, Gender.M));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            StringBuilder byLastName = new StringBuilder();
            for (Student s : studentRepository.studentsByLastName()) {
                byLastName.append(s.getLastName());
            }
            assertEquals("abcd",byLastName.toString());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    @Test
    void sortedByBirthDate(){
        StudentRepository studentRepository=new StudentRepository();
        try{
            studentRepository.addStudent(new Student("Popescu", "c",  LocalDate.of(1991, 6, 20), 1, Gender.M));
            studentRepository.addStudent(new Student("Ionescu", "a", LocalDate.of(2001, 11, 13), 2 , Gender.M));
            studentRepository.addStudent(new Student("Vasilescu", "b", LocalDate.of(2000, 9,20), 3, Gender.F));
            studentRepository.addStudent(new Student("Marian", "d", LocalDate.of(1991, 8,11), 4, Gender.M));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            StringBuilder byBirthDate = new StringBuilder();
            for (Student s : studentRepository.studentsByBirthDate()) {
                byBirthDate.append(s.getLastName());
            }
            assertEquals("cdba",byBirthDate.toString());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }




}
