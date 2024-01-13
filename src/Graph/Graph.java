package Graph;

import java.util.HashMap;

public class Graph {


    HashMap<Integer,HashMap<Integer,Integer>> Adj;

    public Graph(int v){
        Adj = new HashMap<>();
        for (int i = 0; i <= v; i++) {
            Adj.put(i,new HashMap<>());
        }
    }

    public void AddEdge(int v1,int v2,int cost){

        Adj.get(v1).put(v2,cost);
        Adj.get(v2).put(v1,cost);

    }

    public boolean ContainsEdge(int v1,int v2){
        return Adj.get(v1).containsKey(v2);
   }

    public boolean Containsvertex(int v1){
        return Adj.containsKey(v1);
    }

    public int noofEdge(){
        int ans = 0;
        for(int nbr:Adj.keySet()){
            ans = Adj.get(nbr).size();
        }

        return ans/2;
    }

    public void removeEdge(int v1,int v2){
        Adj.get(v1).remove(v2);
        Adj.get(v2).remove(v1);
    }

    public void removevertex(int v1){
        for (int nbr :Adj.get(v1).keySet()){
            Adj.get(nbr).remove(v1);
        }
        Adj.remove(v1);
    }

    public void Display(){
        for(int key : Adj.keySet()){
            System.out.println(key+" "+Adj.get(key));
        }
    }






}
