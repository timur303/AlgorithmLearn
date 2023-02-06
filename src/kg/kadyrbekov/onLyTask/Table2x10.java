package kg.kadyrbekov.onLyTask;

import java.util.Scanner;

public class Table2x10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {

            String b = " x ";
            String a = " = ";
//            System.out.print(2);
            System.out.print(x);
            System.out.print(b);
            System.out.print(i);
            System.out.print(a);
            System.out.println(i * x);
        }
    }
}
