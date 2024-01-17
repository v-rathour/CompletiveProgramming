package Graph;

import java.util.*;

public class Strongly_Connected_Component {

    HashMap<Integer,HashMap<Integer,Integer>> map = new HashMap<>();

    public Strongly_Connected_Component(int v){
        for (int i = 0; i < v; i++) {
            map.put(i,new HashMap<>());
        }
    }

    public void addedge(int v1,int v2){
        map.get(v1).put(v2,5);
    }

    public void KosaRajuAlgo(){
        HashSet<Integer> visited  = new HashSet<>();
        Stack<Integer> st = new Stack<>();

//        fill the stack using all nodes
            dfs(visited,st,0);


//        Transpose krna
        HashMap<Integer,HashMap<Integer,Integer>> map1 = new HashMap<>();
        Transpose(map1);

//        dfs component count karan
        visited  = new HashSet<>();
        int c = 0;
        while(!st.isEmpty()){
            int pop = st.pop();
            if(!visited.contains(pop)){
                c++;
                dfs(map1,visited,pop);
            }
        }

        System.out.println(c);
    }

    public void dfs(HashMap<Integer,HashMap<Integer,Integer>> map1,HashSet<Integer> visited,int vtx){
        visited.add(vtx);
        for(int nbrs : map1.get(vtx).keySet()){
            if(visited.contains(nbrs)){
                dfs(map1,visited,nbrs);
            }
        }
    }

    private void Transpose(HashMap<Integer, HashMap<Integer, Integer>> map1) {
        for(int v1 : map.keySet()){
            for(int v2 : map.get(v1).keySet()){
                if(!map1.containsKey(v2)){
                    map1.put(v2,new HashMap<>());
                }
                map1.get(v2).put(v1,5);
            }
        }
        for(int v1 : map.keySet()){
            if(!map1.containsKey(v1)){
                map1.put(v1,new HashMap<>());
            }
        }
    }

    public void dfs(HashSet<Integer> visited,Stack<Integer> st,int vtx){
        visited.add(vtx);
        for(int nbrs : map.get(vtx).keySet()){
            if(!visited.contains(nbrs)){
                dfs(visited,st,nbrs);
            }
        }
        st.push(vtx);
    }

    public static void main(String[] args) {

    }

}
