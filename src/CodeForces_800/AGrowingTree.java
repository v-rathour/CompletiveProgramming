package CodeForces_800;

import java.util.*;
import java.util.Scanner;

public class AGrowingTree {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        long t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        long q = obj.nextInt();

        long size = 1;
        HashMap<Long,List<Long>> Adj = new HashMap<>();
        Adj.put(1l,new ArrayList<>());
        HashMap<Long,Long> map = new HashMap<>();
        while(q-->0){

            long type = obj.nextInt();

            if(type == 1){
                size++;
                long v = obj.nextInt();
                Adj.put(size,new ArrayList<>());
                Adj.get(v).add(size);

            }
            else{
                long v = obj.nextInt();
                long x = obj.nextInt();
                AddAmount(v,x,map,Adj);
            }

        }
        if(map.size() == 0){
            System.out.println(0);

        }
        else{
            for(long i = 1;i<=size;i++){
                if(map.get(i) != null){
                    System.out.print(map.get(i)+" ");
                }
            }
            System.out.println();
        }

    }

    public static void AddAmount(long v,long x, HashMap<Long,Long> map,
                                 HashMap<Long,List<Long>> Adj){

        Queue<Long> q = new ArrayDeque<>();
        q.add(v);
        if(!map.containsKey(v)){
            map.put(v,x);
        }
        else{
            map.put(v,map.get(v)+x);
        }
        while(!q.isEmpty()){
            long rem = q.remove();
            List<Long> list = Adj.get(rem);

            for(int i = 0; i < list.size(); i++) {
                long num = list.get(i);
                q.add(num);
                if(!map.containsKey(num)){
                    map.put(num,x);
                }
                else{
                    map.put(num,map.get(num)+x);
                }
            }
        }

    }
}
