package Codeforces1000;

import java.util.Arrays;
import java.util.Scanner;

public class LuntikandSubsequences {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){

            solution(obj);

        }
    }

    public static void solution(Scanner obj){
        int n = obj.nextInt();
        int []arr = new int[n];

        long ones = 0;
        long zero = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
            if(arr[i] == 1){
                ones++;
            }

            if(arr[i] == 0){
                zero++;
            }
        }
        long ans = ones;
        if(zero >0){
            ans *= Math.pow(2,zero);
        }
        System.out.println(ans);



    }


}
