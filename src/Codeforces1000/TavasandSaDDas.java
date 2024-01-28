package Codeforces1000;

import java.util.Scanner;

public class TavasandSaDDas {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        solution(obj);
    }

    public static void solution(Scanner obj){

        long n = obj.nextLong();
        String str = n+"";

        int l = str.length();
        int x = (1<<l)-2;

        int y = 0;
        int pos  = 0;
        for (int i = l-1; i >=0 ; i--) {
            if(str.charAt(i) == '7'){
                y = y+(1<<pos);
            }
            pos++;
        }

        System.out.println(x+y+1);


    }

}
