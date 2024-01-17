package Codeforces1000;

import java.util.Scanner;

public class PizzaForces {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        long n = obj.nextLong();

        if(n <=5){
            System.out.println(15);
            return;
        }

        long ans = 0;
        ans += (n/6)*15;
        n %= 6;

        if(n == 1 || n == 2){
            ans -= 15;
            ans += 20;
        }

        if(n == 3 || n == 4){
            ans -= 15;
            ans += 25;
        }

        if(n == 5){
            ans += 15;
        }

        System.out.println(ans);
    }

}
