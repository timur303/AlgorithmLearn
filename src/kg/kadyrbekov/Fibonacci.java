package kg.kadyrbekov;

import java.util.Arrays;

/**
 * @author Timur Kadyrbekov
 */

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibNaive(5) + " Naive ");
        System.out.println(fibEffective(100) + " Effective ");

        int n = 100;
        long [] mem = new long[n+1];

        Arrays.fill(mem,-1);

        System.out.println(fibNaiveMem(n,mem)+ " With Mem" );
    }

    //naive, slow, obvious
    private static long fibNaive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibNaive(n - 1) + fibNaive(n - 2);
    }

    //effective
    public static long fibEffective(int n) {
        long[] arr = new long[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++)
            arr[i] = arr[i - 1] + arr[i - 2];

        return arr[n];
    }

    private static long fibNaiveMem(int n, long[] mem) {
        if (mem[n] != -1)
            return mem[n];

        if (n <= 1) {
            return n;
        }

        long result = fibNaiveMem(n - 1, mem) + fibNaiveMem(n - 2, mem);
        mem[n] = result;

        return result;
    }

}
