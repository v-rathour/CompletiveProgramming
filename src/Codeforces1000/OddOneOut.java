package Codeforces1000;

import java.util.Arrays;
import java.util.Scanner;

public class OddOneOut {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();

        if(a == c){
            System.out.println(b);
        }
        else if(a == b){
            System.out.println(c);
        }
        else if(b == c){
            System.out.println(a);
        }
    }

}

