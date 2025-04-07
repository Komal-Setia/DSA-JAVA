package recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
//Fibonacci series : 0,1,1,2,3,5
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        n = sc.nextInt();

        int sum = fibo(n);
        System.out.println("Sum in Fibonacci series is : " + sum);
    }

    private static int fibo(int n) {
        //base condition
        if (n == 0 || n == 1) {
            return n;
        }
        //recursive condition
        return fibo(n - 1) + fibo(n - 2);
    }
}
