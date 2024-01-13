package Graph;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Prims_Algo {

    HashMap<Integer, HashMap<Integer, Integer>> map;
    public Prims_Algo(int v) {
        // TODO Auto-generated constructor stub
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);

    }

    static class  PrimsPair{
        int e1;
        int e2;
        int cost;

        public PrimsPair(int e1,int e2,int cost){
            this.e1 = e1;
            this.e2 = e2;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return this.e1+" "+this.e2+" "+this.cost;
        }
    }




    public  void Prims(){
        PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>() {
            @Override
            public int compare(PrimsPair o1, PrimsPair o2) {
                return o2.cost-o1.cost;
            }
        });
        pq.add(new PrimsPair(3,3,0));
        HashSet<Integer> visited = new HashSet<>();
        while(!pq.isEmpty()){
            PrimsPair rem = pq.remove();
            if(visited.contains(rem.e1)){
                continue;
            }
            visited.add(rem.e1);
            System.out.println(rem);
            for(int nbrs : map.get(rem.e1).keySet()){
                if(!visited.contains(nbrs)){

                    int cost = map.get(rem.e1).get(nbrs);
                    pq.add(new PrimsPair(nbrs,rem.e1,cost));
                }
            }

        }
    }

    public static void main(String[] args) {
        Prims_Algo g = new Prims_Algo(7);
        g.AddEdge(1, 4, 6);
        g.AddEdge(1, 2, 10);
        g.AddEdge(2, 3, 7);
        g.AddEdge(3, 4, 5);
        g.AddEdge(4, 5, 1);
        g.AddEdge(5, 6, 4);
        g.AddEdge(7, 5, 2);
        g.AddEdge(6, 7, 3);
        g.Prims();
    }



}
