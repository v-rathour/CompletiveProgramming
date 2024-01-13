package Codeforces1000;

import java.util.Scanner;

public class HalloumiBoxes {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        int k = obj.nextInt();

        int []arr = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i] = obj.nextInt();
        }

        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <n ; i++) {
            if(arr[i-1]>arr[i]){
                count++;
            }
            else{
               if(count>=1){
                   max = Math.max(max,count+1);
               }
               else{
                   max = Math.max(max,count);
                }
                count = 0;
            }
        }

        if(count>=1){
            max = Math.max(max,count+1);
        }
        else{
            max = Math.max(max,count);
        }

        if(max<=k){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }

}
