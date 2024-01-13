package CodeForces_800;
//https://codeforces.com/problemset/problem/130/H

import java.util.Scanner;

public class Balanced_brackets {

    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        String str  = obj.next();

        int open = 0;
        int close = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '('){
                open++;
            }
            else{
                if(open<close){
                    System.out.println("NO");
                    return;
                }

                close++;
            }
        }

        if((open-close) == 0){
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
