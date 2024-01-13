package Codeforces1000;

import java.util.HashSet;
import java.util.Scanner;

public class Joyboard {

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
        int k = obj.nextInt();

        if(k>3){
            System.out.println("0");
        }
        else if(k == 3){
            System.out.println(Math.max(0,(m-n+1)-(m/n)));
        }
        else if(k == 2){
            System.out.println(Math.max(0,(m/n-1))+Math.min(m,n));
        }else{
            System.out.println("1");
        }
    }

}
