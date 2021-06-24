import java.util.Scanner;

public class homework5 {

    public static void main(String[] args) {
        String[] n=createArray();
        String s=createString(n);
        System.out.println(s);
    }

    public static String[] createArray() {
        int n = Integer.parseInt(scanner("Insert the length of array: "));
        String[] myArray = new String[n];
        for (int i = 0; i < n; i++) {
            myArray[i] = scanner("Element at index: " + i);
        }
        //for (int i=0;i<n;i++) {
        //    System.out.println(myArray[i]);
        //}
        return myArray;
    }

    public static String scanner(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        String n = scanner.nextLine();
        return n;
    }

    public static String createString (String[] n) {
        String bigString=new String();
        for (int i=0;i<n.length;i++) {
            bigString = bigString + n[i];
        }
        return bigString;
    }
}
