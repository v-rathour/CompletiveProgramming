package Codeforces1000;

import java.util.*;
import java.util.Scanner;

public class PoweringtheHero {

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

        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextLong();
        }

        long ans = 0;

        List<Long> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            long temp = arr[i];

            if(temp == 0){

                if(list.size()>=1){

                    long k = Collections.max(list);
                    ans += k;
                    list.remove(Long.valueOf(k));

                }

            }
            else{
                list.add(temp);

            }

        }

        System.out.println(ans);

    }

}
