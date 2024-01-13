package CodeForces_800;

import java.util.PriorityQueue;
import java.util.Scanner;

//https://codeforces.com/problemset/problem/1849/B
public class Monsters {

    static class Pair implements Comparable<Pair>{

        int val;
        int idx;

        public Pair(int val, int idx){
            this.val = val;
            this.idx = idx;
        }

        public int compareTo(Pair obj){
            return this.val == obj.val?(this.idx-obj.idx):
                                       (obj.val-this.val);
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
        int k = obj.nextInt();

        PriorityQueue<Pair> pq = new PriorityQueue<Pair>();

        for (int i = 1; i <= n; i++) {
            pq.add(new Pair(obj.nextInt(),i));
        }

        while(!pq.isEmpty()){

            Pair rem = pq.remove();
            rem.val -= k;

            if(rem.val<=0){
                System.out.print(rem.idx+" ");
            }
            else{
                pq.add(rem);
            }

        }
        System.out.println();

    }

}
