package CodeForces_800;

import java.util.HashMap;
import java.util.Scanner;

public class UnitedWeStand {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while(t-->0){
            solve(obj);
        }

    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();

        HashMap<Long,Integer> map = new HashMap<>();
        long min = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {

            long num = obj.nextLong();
            min = Math.min(num,min);
            if(!map.containsKey(num)){
                map.put(num,1);
            }
            else{
                map.put(num,map.get(num)+1);
            }
        }

        if(map.size() == 1){
            System.out.println("-1");
            return;
        }

        int k = map.get(min);
        System.out.println(k+" "+(n-k));
        for (int i = 0; i < k; i++) {
            System.out.print(min+" ");
        }

        System.out.println();
       for(long key : map.keySet()){
           if(key != min){
               for (int i = 0; i < map.get(key); i++) {
                   System.out.print(key+" ");
               }
           }
       }
        System.out.println();

    }

}
