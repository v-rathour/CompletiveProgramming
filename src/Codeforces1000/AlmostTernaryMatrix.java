package Codeforces1000;

import java.util.Scanner;

public class AlmostTernaryMatrix {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        String s = "";
        for (int i = 1; i <=50; i++) {
            if(i%2 == 0){
                s += "00";
            }
            else{
                s += "11";
            }
        }
        while(t-->0){
            solution(obj,s);
        }
    }

    public static void solution(Scanner obj,String s){

        int n = obj.nextInt();
        int m = obj.nextInt();
        String s1 = s.substring(3,3+m);
        String s2 = s.substring(1,1+m);

        for (int i = 0; i < n/2; i++) {
            if(i%2 == 0){
                for (int j = 0; j < s2.length(); j++) {
                    System.out.print(s2.charAt(j)+" ");
                }
                System.out.println();
                for (int j = 0; j < s1.length(); j++) {
                    System.out.print(s1.charAt(j)+" ");
                }
                System.out.println();
            }
            else{

                for (int j = 0; j < s1.length(); j++) {
                    System.out.print(s1.charAt(j)+" ");
                }
                System.out.println();
                for (int j = 0; j < s2.length(); j++) {
                    System.out.print(s2.charAt(j)+" ");
                }
                System.out.println();
            }
        }


    }

}
