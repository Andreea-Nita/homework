import java.util.Scanner;

public class homework2 {

        public static void main(String[] args) {
            indiceMasaCorporala();
        }

        private static void indiceMasaCorporala() {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Introduceti inaltimea in metri");
            double inaltime= scanner.nextDouble();
            System.out.println("Introduceti greutatea in kg");
            double masa= scanner.nextDouble();
            double indice=masa/(Math.pow(inaltime,2));
            System.out.println("Indicele de masa corporala este: "+(int)(indice*100)/100.0);

        }

}
