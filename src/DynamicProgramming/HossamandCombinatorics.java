package DynamicProgramming;

import java.util.HashMap;
import java.util.Scanner;

public class HossamandCombinatorics {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            int num = obj.nextInt();
            if(!map.containsKey(num)){
                map.put(num,1);
            }
            else{
                map.put(num,map.get(num)+1);
            }

            max = Math.max(max,num);
            min = Math.min(min,num);

        }

        if(max == min){

            int freq = map.get(max);
            Long ans = (long)((freq-1))*freq;
            System.out.println(ans);
        }
        else{
            Long ans =(long)(map.get(max)*2)*map.get(min);
            System.out.println(ans);
        }

    }

}
