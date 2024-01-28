package Codeforces1000;

import java.util.*;
import java.util.Scanner;

public class ArrayReodering {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        List<Integer> oddlist = new ArrayList<>();
        int even = 0;

        for (int i = 0; i < n; i++) {
            int num = obj.nextInt();
            if((num&1) == 0){
                even++;
            }
            else{
                oddlist.add(num);
            }
        }

        long ans = 0;
        for(int i = 0;i<even;i++){
            ans += (n-(i+1));
        }
        int count = 0;
        for (int i = 0; i < oddlist.size(); i++) {
            for (int j = i+1; j < oddlist.size(); j++) {
                  if(findGCD(oddlist.get(i),oddlist.get(j))>1){
                      count++;
                  }
            }
        }
        System.out.println((ans+count));

    }

    public static int findGCD(int a, int b) {
        // Ensure that both numbers are non-negative
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

}
