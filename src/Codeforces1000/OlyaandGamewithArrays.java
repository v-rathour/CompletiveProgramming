package Codeforces1000;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class OlyaandGamewithArrays {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        long n = obj.nextInt();

        PriorityQueue<Long> maxset = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Long> minset = new PriorityQueue<>();

        long ans = 0;
        Long one = Long.MAX_VALUE;
        long two = Long.MAX_VALUE;

        for (long i = 0; i < n; i++) {

            long m = obj.nextInt();

            long first = Long.MAX_VALUE;
            long second = Long.MAX_VALUE;

            for (long j = 0; j < m; j++) {
                long temp = obj.nextLong();

                if(temp<first){
                    second = first;
                    first = temp;
                }
                else if(temp<second){
                    second = temp;
                }
            }

            one = Math.min(one,first);
            two = Math.min(second,two);

            ans += second;
        }
        ans -= two;
        ans += one;

        System.out.println(ans);

    }

}
