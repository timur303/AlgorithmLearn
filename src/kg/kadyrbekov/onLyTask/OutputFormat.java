package kg.kadyrbekov.onLyTask;

import java.util.Scanner;

public class OutputFormat {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.nextLine();
        s = scan.nextLine();
//        d = 3.1415;
//        i = 42;

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

    }
}
