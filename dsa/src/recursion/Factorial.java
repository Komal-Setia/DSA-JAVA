package recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        n = sc.nextInt();

        int fact = factorial(n);
        System.out.println("Factorial of " + n + " is : " + fact);

    }

    private static int factorial(int n) {
        //base condition
        if (n == 0) {
            return 1;
        }
        //recursive condition
        return n * factorial(n - 1);
    }
}
