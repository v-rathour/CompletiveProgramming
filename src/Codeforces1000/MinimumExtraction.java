package Codeforces1000;

import java.util.*;

public class MinimumExtraction {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            pq.add(obj.nextLong());
        }

        List<Long> ans = new ArrayList<>();
        long store = 0;
        while(!pq.isEmpty()){

            long rem = pq.remove();

            long temp = rem - store;
            store += temp;
            ans.add(temp);

        }

        Collections.sort(ans);
        System.out.println(ans.get(ans.size()-1));

    }

}
