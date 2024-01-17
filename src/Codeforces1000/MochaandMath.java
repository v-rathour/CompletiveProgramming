package Codeforces1000;

import java.util.Scanner;

public class MochaandMath {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();

        int arr[] =  new int[n];
        for(int i = 0;i<n;i++) {
            arr[i] = obj.nextInt();

        }

        int ans = arr[0];
        for (int i = 1; i < n; i++) {
            ans  = ans & arr[i];
        }

        System.out.println(ans);

    }

}
