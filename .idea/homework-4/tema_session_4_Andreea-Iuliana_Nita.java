import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti n:");
        int n= scanner.nextInt();
        calculeazaFactorial(n);
    }

    public static void calculeazaFactorial (int n) {
        int rezultat=1;
        for (int i=1;i<=n;i++) {
            rezultat=rezultat*i;
        }
        System.out.println(n+"!="+rezultat);

    }

}
