package Codeforces1000;

import java.util.HashMap;
import java.util.*;

public class Mst_0_1 {

    private HashMap<Integer,HashMap<Integer,Integer>> map = new HashMap<>();
    public Mst_0_1(int v){
        for (int i = 1; i <= v; i++) {
            map.put(i,new HashMap<>());
        }
    }

    class PrimsPair {
        int e1;
        int acqv;
        int cost;

        public PrimsPair(int e1, int acvq, int cost) {
            // TODO Auto-generated constructor stub
            this.e1 = e1;
            this.acqv = acvq;
            this.cost = cost;
        }

        public String toString() {
            return this.e1 + " " + this.acqv + " @ " + this.cost;
        }
    }

    public void Prims() {
        PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>() {
            @Override
            public int compare(PrimsPair o1, PrimsPair o2) {
                // TODO Auto-generated method stub
                return o1.cost - o2.cost;
            }
        });
        pq.add(new PrimsPair(3, 3, 0));
        int ans = 0;
        HashSet<Integer> visited = new HashSet<>();
        while (!pq.isEmpty()) {
            PrimsPair rp = pq.poll();
            if (visited.contains(rp.e1)) {
                continue;
            }
            visited.add(rp.e1);
            ans = ans+rp.cost;
            for (int nbrs=1;nbrs<=map.size();nbrs++) {
                if (!visited.contains(nbrs)) {
                    int cost = 0;
                    if(map.get(rp.e1).containsKey(nbrs)){
                        cost = 1;
                    }
                    pq.add(new PrimsPair(nbrs, rp.e1, cost));
                }
            }
        }

        System.out.println(ans);
    }

    public void AddEdge(int a,int b,int cost){
        map.get(a).put(b,cost);
        map.get(b).put(a,cost);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int m = obj.nextInt();
        Mst_0_1 ms = new Mst_0_1(n);
        while(m-->0){

            int a = obj.nextInt();
            int b = obj.nextInt();
            ms.AddEdge(a,b,1);

        }
        ms.Prims();
    }

}
