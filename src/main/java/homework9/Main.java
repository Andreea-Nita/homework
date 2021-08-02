package homework9;

public class Main {
    public static void main(String[] args) {

        Student student=new Student("1", "Andreea");
        student.goToClass();

        Professor profesor=new Professor();
        profesor.setName("Alexandru");
        profesor.teach();

    }
}
