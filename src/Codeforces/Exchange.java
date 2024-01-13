package Codeforces;

import java.util.Scanner;

public class Exchange {


    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        int a = obj.nextInt();
        int b = obj.nextInt();

        if(a<=b){
            int rem = n/a;
            if(n%a != 0){
                rem++;
            }
            System.out.println(rem);

        }
        else{
            System.out.println(1);
        }

    }

}
