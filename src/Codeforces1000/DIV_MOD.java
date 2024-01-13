package Codeforces1000;

import java.util.Scanner;

public class DIV_MOD {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        long l = obj.nextLong();
        long r = obj.nextLong();
        long a = obj.nextLong();

        long max = Long.MIN_VALUE;
        max = Math.max(max,(r/a)+(r%a));
        if(l == r){
            System.out.println(r%a+r/a);
        }
        else if(r%a == 0){

            long div = (r-1)/a;
            long mod = (r-1)%a;
            max = Math.max(max,div+mod);
            System.out.println(max);
        }
        else{

            long rem = r-r%a-1;

            if(rem>=l){
                long div = rem/a;
                long mod = rem%a;
                max = Math.max(max,div+mod);
            }
            System.out.println(max);
        }

    }

}
