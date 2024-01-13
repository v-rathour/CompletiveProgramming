package Codeforces1000;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class YetnotherrokenKeoard {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        String str = obj.next();
        int b = 0, B = 0;

        StringBuilder str2 = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            int n = (int)(ch);
            if(ch=='B') {
                B++;
                continue;
            }
            if(ch=='b') {
                b++;
                continue;
            }
            if (n < 97) {
                if (B > 0) {
                    B--;
                } else {
                    str2.append(ch);
                }
            } else {
                if (b > 0) {
                    b--;
                } else {
                    str2.append(ch);
                }
            }
        }

        System.out.println(str2.reverse());
    }
}





