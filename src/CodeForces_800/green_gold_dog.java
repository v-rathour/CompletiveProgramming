package CodeForces_800;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class green_gold_dog {

    public static class Pair implements Comparable<Pair>{
        long val;
        int idx;

        public Pair(long val,int idx){
            this.val = val;
            this.idx = idx;
        }


        public int compareTo(Pair obj) {
            if(this.val == obj.val){
                return obj.idx-this.idx;
            }
            return (int)(obj.val-this.val);
        }
    }

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }

    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            pq.add(new Pair(obj.nextLong(),i));
        }
        int count = 1;
        int arr[] = new int[n];
        while(!pq.isEmpty()){
           Pair rem = pq.remove();
           arr[rem.idx] = count;
           count++;
        }


        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

}
