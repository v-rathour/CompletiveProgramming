package Codeforces1000;

import java.util.*;
import java.util.Scanner;

public class GoldRush {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        long t = obj.nextLong();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        long n = obj.nextLong();
        long m = obj.nextLong();

        if (n < m) {
            System.out.println("NO");
        }
        else if(n == m){
            System.out.println("YES");
        }
        else{
            Queue<Long> q = new ArrayDeque<>();
            q.add(n);
            while(!q.isEmpty()){
                long rem = q.poll();

                if(rem%3 != 0){
                    continue;
                }

                long temp = rem/3;
                long a = temp+temp;

                if(a == m || temp == m){
                    System.out.println("YES");
                    return;
                }

                q.add(a);
                q.add(temp);

            }
            System.out.println("NO");
        }

    }

}
