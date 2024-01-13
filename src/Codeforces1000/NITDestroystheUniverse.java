package Codeforces1000;

import java.util.Scanner;

public class NITDestroystheUniverse {

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
        int zeros = 0;
        for(int i = 0;i<n;i++){
            arr[i] = obj.nextInt();
            if(arr[i] == 0){
                zeros++;
            }
        }

        if(zeros == n){
            System.out.println("0");
            return;
        }

        if(zeros == 0){
            System.out.println("1");
            return;
        }

        int count = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] != 0){
                count++;
            }
            else{
               if(count >=1){
                   ans++;
               }
               count = 0;
            }
        }

        if(count != 0){
            ans++;
        }

        if(ans == 1){
            System.out.println(ans);
        }
        else{
            System.out.println("2");
        }


    }

}
