package Codeforces1000;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ArrayCloningTechnique {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();

        HashMap<Integer,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int temp = obj.nextInt();
            if(!map.containsKey(temp)){
                map.put(temp,1);
                max = Math.max(max,map.get(temp));
            }
            else{
                map.put(temp,map.get(temp)+1);
                max = Math.max(max,map.get(temp));
            }
        }

        n -= max;
        int operation = n;
        while(n>0){
            operation++;
            n -= max;
            max = max*2;
        }

        System.out.println(operation);

    }

}
