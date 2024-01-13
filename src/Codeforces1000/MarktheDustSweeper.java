package Codeforces1000;

import java.util.Scanner;

public class MarktheDustSweeper {

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

        for(int i = 0;i<n;i++){
            arr[i] = obj.nextLong();
        }
        int []left = new int[n];
        int count = 0;
        for (int i = n-2; i >=0; i--) {
            if(arr[i] == 0){
                count++;
            }
            else{
                left[i] = count;
                count = 0;
            }
        }

        if(count == n-1){
            System.out.println("0");
        }
        else{

            long ans = 0;
            for (int i = 0; i < n-1; i++) {
                ans += arr[i];
            }

            for (int i = 0; i < n; i++) {
                ans += left[i];
            }

            System.out.println(ans);
        }

    }
}
