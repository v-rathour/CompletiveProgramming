package Codeforces1000;

import java.util.*;

public class BurenkaPlays{

    public static void main(String []args){

        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while(t-->0){
            solution(obj);
        }

    }

    public static void solution(Scanner obj){

        long a = obj.nextLong();
        long b = obj.nextLong();
        long c = obj.nextLong();
        long d = obj.nextLong();

        long temp1 = a*d;
        long temp2 = c*b;

        if(temp1 == temp2){
            System.out.println("0");
        }
        else if(temp1 == 0 || temp2 == 0){
            System.out.println("1");
        }
        else if(temp1%temp2 == 0 || temp2%temp1 == 0){
            System.out.println("1");
        }
        else{
            System.out.println("2");
        }
    }
}
