package Codeforces1000;

import java.util.HashMap;
import java.util.Scanner;

public class UnattractivePairs {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        String s = obj.next();

        HashMap<Character,Long> map = new HashMap<>();
        long max = Long.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1L);
            }
            else{
                map.put(ch,map.get(ch)+1);
            }
            max = Math.max(max,map.get(ch));
        }

        if(max>n/2){
            System.out.println(2*max-n);
        }
        else if(n%2 == 1){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }

    }

}
