package Codeforces;

import java.util.Scanner;

public class TwoTowers {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        int m = obj.nextInt();


        StringBuilder s1 = new StringBuilder(obj.next());
        StringBuilder s2 = new StringBuilder(obj.next());

        boolean flag = false;
        int i = 0;
        for (; i < n-1; i++) {
            if(s1.charAt(i) == s1.charAt(i+1)){
                flag = true;
                break;
            }
        }

        if(flag){
            String temp = s1.substring(i+1);
            String rev = "";
            for (int j = temp.length()-1; j >=0 ; j--) {
                char ch = temp.charAt(j);
                rev += ch;
            }

            s2.append(rev);
            for (int j = 0; j < s2.length()-1; j++) {
                if(s2.charAt(j) == s2.charAt(j+1)){
                    System.out.println("NO");
                    return;
                }
            }
        }

        flag = false;
        int j = 0;
        for (; j < s2.length()-1; j++) {
            if(s2.charAt(j) == s2.charAt(j+1)){
                flag = true;
                break;
            }
        }

        if(flag){
            String temp = s2.substring(j+1);
            String rev = "";
            for (int k = temp.length()-1; k >=0 ; k--) {
                char ch = temp.charAt(k);
                rev += ch;
            }

            s1.append(rev);
            for (int k = 0; k < s1.length()-1; k++) {
                if(s1.charAt(k) == s1.charAt(k+1)){
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.println("YES");
    }

}
