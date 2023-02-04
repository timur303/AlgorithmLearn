package kg.kadyrbekov.onLyTask;

import java.util.Scanner;

public class Weird {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N >= 0 && N <= 2) {
            System.out.println("Weird");
        }
        if (N >= 2 && N <= 5) {
            System.out.println("notWeird");
        } else if (N >= 6 && N <= 20) {
            System.out.println("Weird");
        } else if (N > 20) {
            System.out.println("Not weird");
        }

        scanner.close();
    }

}
