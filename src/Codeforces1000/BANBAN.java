package Codeforces1000;

import java.util.Scanner;

public class BANBAN {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        if(n == 1){
            System.out.println("1");
            System.out.println("1 2");
        }
        else if(n == 2){
            System.out.println("1");
            System.out.println(2+" "+6);
        }
        else{
            System.out.println(n-1);
            int i = 1;
            int a = 2;
            int b = 6;
            while(i<=n-1){
                if(i == 1){
                    System.out.println(a+" "+b);
                    a += 2;
                    b += 3;
                }
                else{
                    System.out.println(a+" "+b);
                    a++;
                    b += 3;
                }
                i++;
            }
        }

    }

}
