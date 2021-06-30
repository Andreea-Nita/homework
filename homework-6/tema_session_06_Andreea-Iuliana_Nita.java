import java.util.Scanner;

public class finalPrice {
    public static void main (String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Insert price");
        double price=scanner.nextDouble();
        System.out.println("Insert VAT");
        double vat=scanner.nextDouble();
        System.out.println("Pretul final este "+calculatePrice(price,vat));

    }

    public static double calculatePrice (double price, double vat){
        return price+price*(vat/100);
    }
}