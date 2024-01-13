package Codeforces1000;

import java.util.*;
import java.util.Scanner;

public class ShoeShuffling {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        long []arr = new long[n];

        int count = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            arr[i] = obj.nextInt();
        }

        HashMap<Long,List<Integer>> map = new HashMap<>();
        List<Long> list = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            if(!map.containsKey(arr[i])){
                map.put(arr[i],new ArrayList<>());
                map.get(arr[i]).add(i);
                list.add(arr[i]);
            }
            else{
                map.get(arr[i]).add(i);
            }
        }

        for(Long i:map.keySet()){
            if(map.get(i).size() == 1){
                System.out.println("-1");
                return;
            }
        }

        for (Long i :list) {
            List<Integer> ll = map.get(i);
            if(ll.size()%2 != 0){
                int mid = (ll.size()/2);
                for (int j = ll.size()-1; j >=0; j--) {
                    if(j != mid){
                        System.out.print((ll.get(j)+1)+" ");
                    }
                }
                System.out.print((ll.get(mid)+1)+" ");
            }
            else{
                for (int j = ll.size()-1;j>=0; j--) {
                    System.out.print((ll.get(j)+1)+" ");
                }
            }
        }
        System.out.println();


    }

}
