import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti n:");
        int n= scanner.nextInt();
        factorial(n);
    }

    public static void factorial (int n) {
        int rezultat=1;
        for (int i=1;i<=n;i++) {
            rezultat*=i;
        }
        System.out.println(n+"!="+rezultat);

    }
}
