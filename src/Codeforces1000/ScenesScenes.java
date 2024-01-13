package Codeforces1000;

import java.util.HashMap;
import java.util.Scanner;

public class ScenesScenes {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
       StringBuilder s = new StringBuilder(obj.next());

       for(int i = 0;i<n;i++){
           char ch = s.charAt(i);
           if(ch != '2' && ch != '5' && ch != '3' && ch != '7'){
               System.out.println("1"+"\n"+ch);
               return;
           }
       }

        for (int i = 0; i < n; i++) {
            int a = s.charAt(i)-'0';
            for (int j = i+1; j < n; j++) {
                int b = s.charAt(j)-'0';
                int temp = a*10+b;
                if(!isPrime(temp)){
                    System.out.println(2+"\n"+temp);
                    return;
                }
            }
        }

    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        // Check for divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Not a prime number
            }
        }

        return true; // Prime number
    }

}
