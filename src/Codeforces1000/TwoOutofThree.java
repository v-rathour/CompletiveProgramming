package Codeforces1000;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoOutofThree{

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while (--t>=0) {
            solution(obj);
        }
    }
    
    public static void solution(Scanner obj){
        int n = obj.nextInt();
        int[] nums = new int[n];

        HashMap<Integer,Integer> map = new HashMap<>();
        int[] b = new int[n];

        for(int i =0;i<n;i++){

            nums[i] = obj.nextInt();
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);

        }
        for (int i = 0; i < 1000; i++) {
            continue;
        }
        int c =0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if(entry.getValue()>=2)
            {
                c++;
            }
        }
        int as =0;

        if(c<2){
            System.out.println(-1);
        }
        else{
            for(int i =0;i<n;i++){
                if(map.get(nums[i])>=2){
                    if(as==0){
                        b[i] =2;
                        as =1;
                    }
                    else{
                        b[i] =3;
                    }
                    map.put(nums[i], 0);
                }
                else
                    b[i] =1;
                System.out.print(b[i]+" ");
            }
            System.out.println();
        }
    }
}