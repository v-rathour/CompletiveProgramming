package Codeforces1000;

import java.util.Scanner;
import java.util.Stack;

public class NapoleonCake {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        int []a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = obj.nextInt();
        }

        int cream = 0;
        StringBuilder str = new StringBuilder("");
        int i = n-1;

        while(i>=0){

            int rem = a[i];
            cream = Math.max(rem,cream);
            if(cream>0){
                cream--;
                str.append("1 ");
            }
            else{
                str.append("0 ");
            }
            i--;
        }


        System.out.println(str.reverse().toString().trim());

    }

}
