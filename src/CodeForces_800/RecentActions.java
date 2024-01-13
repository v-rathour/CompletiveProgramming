package CodeForces_800;

import java.util.*;
import java.util.Scanner;

public class RecentActions {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){

            solve(obj);

        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        int m = obj.nextInt();

        Queue<Integer> pq = new ArrayDeque<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i = n; i >= 1; i--) {

            pq.add(i);
            map.put(i,-1);
            set.add(i);
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            int num = obj.nextInt();
            count++;
            if(!set.contains(num)){
                set.remove(pq.peek());
                map.put(pq.peek(),count);
                set.add(num);
                pq.remove();
                pq.add(num);
            }
        }

        for (int i = 1; i <=n; i++) {
            System.out.print(map.get(i)+" ");
        }
        System.out.println();

    }

}
