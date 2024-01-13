package CodeForces_800;
//https://codeforces.com/problemset/problem/1822/B
import java.util.PriorityQueue;
import java.util.Scanner;

public class KarinaandArray {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            pq.add(obj.nextLong());
        }

        long max = Long.MIN_VALUE;
        long pre = pq.remove();
        while(!pq.isEmpty()){
            long rem = pq.remove();
            max = Math.max(max,rem*pre);
            pre = rem;
        }

        System.out.println(max);


    }

}
