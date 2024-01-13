package Codeforces1000;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class ABCString {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        String s = obj.next();
        int n = s.length();

        if(s.charAt(0) == s.charAt(n-1)){
            System.out.println("NO");
            return;
        }

        int open = 0;
        int close = 0;
        char opch = s.charAt(0);
        char clch = s.charAt(n-1);
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch == opch){
                open++;
            }

            if(ch == clch){
                close++;
            }
        }

        if(open == close && (open+close) == n){
            System.out.println("YES");
        }
        else{
            int rb = Math.abs(open-close);
            int rm = n - (open+close);
            if(rb != rm){
                System.out.println("NO");
                return;
            }

            if(open>close){
                int p = 0;
                int c = 0;
                for (int i = 0; i < n; i++) {
                    char ch = s.charAt(i);
                    if(ch == opch){
                        p++;
                    }
                    else{
                        c++;
                    }

                    if(c>p){
                        System.out.println("NO");
                        return;
                    }
                }
                System.out.println("YES");
            }
            else{
                int p = 0;
                int c = 0;

                for (int i = n-1; i >=0 ; i--) {
                    char ch = s.charAt(i);
                    if(ch == clch){
                        c++;
                    }
                    else{
                        p++;
                    }

                    if(c<p){
                        System.out.println("NO");
                        return;
                    }
                }
                System.out.println("YES");
            }
        }

    }

}
