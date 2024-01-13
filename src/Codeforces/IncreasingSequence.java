package Codeforces;

import java.util.Scanner;

public class IncreasingSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            solution(sc);
        }
    }

    public static void solution(Scanner sc){

        int n = sc.nextInt();
        long arr[] = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        long count = 1;
        int idx = 0;
        while(idx != n){

            if(count != arr[idx]){
                idx++;
            }
            count++;
        }

        System.out.println(count-1);
    }

}
