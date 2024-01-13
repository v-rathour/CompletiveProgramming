package Codeforces1000;

import java.util.Scanner;

public class AvtoBus {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        long n = obj.nextLong();
        if(n%2 != 0 || n<4){
            System.out.println("-1");
        }else{

            long first = n/4;
            long second = n/6;
            long temp = n%6;
            if(temp != 0){
                second++;
            }

            long min = Math.min(first,second);
            long max = Math.max(first,second);
            System.out.println(min+" "+max);


        }




    }

}
