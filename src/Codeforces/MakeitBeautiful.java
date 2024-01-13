package Codeforces;

import java.util.*;
import java.util.Scanner;

public class MakeitBeautiful {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        Integer []arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }

        Arrays.sort(arr,Collections.reverseOrder());

        for (int i = 1; i < n; i++) {
            if( i == 1 && arr[i-1] == arr[i]){
                int j = i+1;
                while(j<n && arr[i] == arr[j]){
                    j++;
                }
                if(j == n){
                    System.out.println("NO");
                    return;
                }
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        System.out.println("YES");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
