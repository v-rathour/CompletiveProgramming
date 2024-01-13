package Codeforces;

import java.util.Scanner;

public class Advantage {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        long arr[] = new long[n];

        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextLong();

            if(firstMax<arr[i]){
                secondMax = firstMax;
                firstMax = arr[i];
            }
            else if(secondMax<arr[i]){
                secondMax = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if(arr[i] != firstMax){
                System.out.print((arr[i]-firstMax)+" ");
            }
            else{
                System.out.print((arr[i] - secondMax)+" ");
            }
        }

        System.out.println();

    }


}

