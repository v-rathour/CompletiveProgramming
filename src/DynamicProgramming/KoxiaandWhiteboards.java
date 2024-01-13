package DynamicProgramming;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KoxiaandWhiteboards {

    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }

    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        int m = obj.nextInt();

        PriorityQueue<Long> pq1 = new PriorityQueue<>();


        for (int i = 0; i < n; i++) {
            pq1.add(obj.nextLong());
        }

        for (int i = 0; i < m; i++) {
            pq1.remove();
            pq1.add(obj.nextLong());
        }

        long sum = 0;

        while(!pq1.isEmpty()){
            long a = pq1.remove();
            sum += a;
        }

        System.out.println(sum);
    }

}
