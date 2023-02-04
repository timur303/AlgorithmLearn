package kg.kadyrbekov.onLyTask;

import java.util.Timer;

public class FindNaturalNum {
    public static void main(String[] args) {



        System.out.println(findSum(9999));
    }

    public static int findSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

}
