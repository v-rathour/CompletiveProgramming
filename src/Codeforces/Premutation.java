package Codeforces;

import java.util.HashMap;
import java.util.*;

public class Premutation {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        int permu[][] =  new int[n][n-1];
        HashMap<Integer,List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                permu[i][j] = obj.nextInt();
            }
        }

        int i = 0;
        while(i<n){
            for (int j = 0; j < n-1; j++) {

                int num = permu[i][j];
                if(!map.containsKey(num)){
                    List<Integer> list = new ArrayList<>();
                    list.add(j+1);
                    map.put(num,list);
                }
                else{
                    List<Integer> list = map.get(num);
                    list.add(j+1);
                    map.put(num,list);
                }
            }
            i++;
        }
        int arr[] = new int[n+1];

        for(int key :map.keySet()){
            List<Integer> list = map.get(key);
            Collections.sort(list);
            int first = list.get(0);
            int last = list.get(list.size()-1);
            if(first == last){
                if(first == n-1){
                    arr[n] =  key;
                }
                else{
                    arr[last] = key;
                }
            }
            else{
                arr[Math.max(first,last)] = key;
            }
        }

        for (int j = 1; j <= n; j++) {
            System.out.print(arr[j]+" ");
        }
        System.out.println();

    }

}
