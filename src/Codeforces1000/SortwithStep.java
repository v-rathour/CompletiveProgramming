package Codeforces1000;

import java.util.*;
import java.util.Scanner;

public class SortwithStep {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        int k = obj.nextInt();

        int []arr = new int[n];
        int []temp = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
            temp[i] = arr[i];
        }

        HashMap<Integer,HashSet<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            if(!map.containsKey(i%k)){
                map.put(i%k,new HashSet<>());
                map.get(i%k).add(num);
            }
            else{
                map.get(i%k).add(num);
            }
        }

        Arrays.sort(temp);

        HashMap<Integer,Integer> index = new HashMap<>();
        for (int i = 0; i < n; i++) {
            HashSet<Integer> set = map.get(i%k);
            if(set.contains(arr[i]) != set.contains(temp[i])){
                if(!index.containsKey(i%k)){
                    index.put(i%k,1);

                }
                else{
                    index.put(i%k,index.get(i%k)+1);
                }
            }
        }

        if(index.size() ==0){
            System.out.println("0");
            return;
        }

        int count = 0;
        for(int indx : index.keySet()){
            if(index.get(indx) == 1){
                count +=1;
            }
            else{
                count += 10;
            }
        }

        if(count == 2){
            System.out.println("1");
        }
        else{
            System.out.println("-1");
        }
    }

}
