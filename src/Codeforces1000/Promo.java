package Codeforces1000;

import java.util.Arrays;
import java.util.Scanner;

public class Promo {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        solution(obj);
    }

    public static void solution(Scanner obj){
        int n = obj.nextInt();
        int q = obj.nextInt();

        long []arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextLong();
        }

        Arrays.sort(arr);
        long []left = new long[n];
        left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left[i] = left[i-1]+arr[i];
        }
        while(q-->0){

            int x = obj.nextInt();
            int y = obj.nextInt();

            int idx = n-x;
            int last = idx+y-1;
            long pre = 0;
            if((idx-1)>=0){
               pre = left[idx-1];
            }

            long ans = left[last]-pre;
            System.out.println(ans);

        }
    }

}
