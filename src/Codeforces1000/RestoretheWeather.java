package Codeforces1000;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class RestoretheWeather {

    public static void main(String []args){

        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }

    }

    static class Pair implements Comparable<Pair>{

        long val ;
        int idx ;

        public Pair(long val,int idx){

            this.val = val;
            this.idx = idx;

        }
        public int compareTo(Pair obj){
            return (this.val == obj.val)?(this.idx-obj.idx):(int)(this.val-obj.val);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        long k = obj.nextLong();


        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            long temp = obj.nextLong();
            pq.add(new Pair(temp,i));
        }

        long []b = new long[n];
        for (int i = 0; i < n; i++) {
            b[i] = obj.nextLong();
        }

        Arrays.sort(b);
        long []ans = new long[n];
        int i = 0;
        while(!pq.isEmpty()){

            Pair rem = pq.remove();
            ans[rem.idx] = b[i];
            i++;
        }

        for (int j = 0; j < n; j++) {
            System.out.print(ans[j]+" ");
        }

        System.out.println();



    }

}
