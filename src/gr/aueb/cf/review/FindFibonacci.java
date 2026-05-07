package gr.aueb.cf.review;

import java.util.Scanner;

public class FindFibonacci {

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the fibonacci number position");
        n = sc.nextInt();
        System.out.println("The fibonacci number in that position is " + findFibonacci(n));

    }

    public static int findFibonacci(int n) {
        if (n < 0) return -1;
        if (n == 0) return 0;
        if (n == 1) return 1;
        int prev = 0;
        int curr = 1;
        int next = 1;

        for (int i = 2; i <= n; i++) {
             next = prev + curr;
            prev = curr;
            curr = next;
        }
        return next;
    }

    public static int findFibonacci2 ( int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return findFibonacci2(n -1) + findFibonacci2(n -2);
    }
}