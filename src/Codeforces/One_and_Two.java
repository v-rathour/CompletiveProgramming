package Codeforces;

import java.util.Scanner;

public class One_and_Two {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){

            solve(obj);

        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        int arr[] = new int[n];
        long right = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
            right *= arr[i];
        }
        long left = 1;
        for (int i = 0; i <n ; i++) {
            left *= arr[i];
            right /= arr[i];

            if(left == right){
                System.out.println(i+1);
                return;
            }
        }
        System.out.println("-1");

    }

}
