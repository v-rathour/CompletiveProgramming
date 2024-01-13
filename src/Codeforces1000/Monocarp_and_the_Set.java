package Codeforces1000;

import java.util.Scanner;

public class Monocarp_and_the_Set {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int m = obj.nextInt();

        String s = obj.next();
        StringBuilder str  = new StringBuilder(s);

        long ans = 1;
        for (int i = 1; i < n-1; i++) {
            if(str.charAt(i) == '?'){
                ans = ans*i;
            }
        }

        if(str.charAt(0) == '?'){
            System.out.println("0");
        }
        else{
            System.out.println(ans);;
        }

        while(m-->0){
            int p = obj.nextInt();
            char ch = obj.next().charAt(0);
            p -= 1;

            if(p == 0){
                str.setCharAt(p,ch);
                if(str.charAt(0) == '?')
                    System.out.println("0");
                else
                    System.out.println(ans);
            }
            else{
                if(str.charAt(p) == '?'){
                    ans = ans/p;
                }
                str.setCharAt(p,ch);
                if(str.charAt(p) == '?'){
                    ans = ans*p;
                }

                System.out.println(ans);
            }

        }

    }

}
