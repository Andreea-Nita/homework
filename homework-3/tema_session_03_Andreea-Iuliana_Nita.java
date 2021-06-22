import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        greeting();

    }
    public static void greeting() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Type in your name (or just press Enter if you want to be anonymous): ");
        String name= scanner.nextLine();
        if (name.length()==0) {
            System.out.println("Hello, stranger!");
        } else {
            System.out.println("Hello, "+name+"!");
        }
    }

}

