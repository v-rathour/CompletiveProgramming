package Codeforces1000;

import java.util.Scanner;

public class DifferentDivisors {

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        return true;
    }

    public static void solve(Scanner obj) {

        int d = obj.nextInt();
        int x = 1 + d;
        int ans1 = 0;
        int ans2 = 0;
        while (true) {
            if (isPrime(x)) {
                ans1 = x;
                break;
            }
            x++;
        }
        x += d;
        while (true) {
            if (isPrime(x)) {
                ans2 = x;
                break;
            }
            x++;
        }
        System.out.println(ans1 * ans2);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while (t-- > 0) {
            solve(obj);
        }

    }

}
