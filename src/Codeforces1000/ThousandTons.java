package Codeforces1000;

import java.util.Arrays;
import java.util.Scanner;

public class ThousandTons {

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

        Arrays.sort(arr);
        System.out.println(arr[n-1]-arr[0]);

    }

}
