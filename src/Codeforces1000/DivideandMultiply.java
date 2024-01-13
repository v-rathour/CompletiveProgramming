package Codeforces1000;

import java.util.Arrays;
import java.util.Scanner;

public class DivideandMultiply {

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


        int count = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]%2 == 0){
                long copy = arr[i];
                while(copy%2 == 0){
                    copy /= 2;
                    count++;
                }

                arr[i] = copy;
            }

        }

        Arrays.sort(arr);
        long temp = (long)Math.pow(2,count);
        arr[n-1] *= temp;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += arr[i];
        }

        System.out.println(ans);

    }

}
