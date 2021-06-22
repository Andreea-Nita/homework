import java.util.Scanner;

public class homework3 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Type in your name (or just press Enter if you want to be anonymous): ");
        String name= scanner.nextLine();
        greeting(name);
    }

    public static void greeting(String name) {
        if (name.length()==0) {
            System.out.println("Hello, stranger!");
        } else {
            System.out.println("Hello, "+name+"!");
        }
    }

}


