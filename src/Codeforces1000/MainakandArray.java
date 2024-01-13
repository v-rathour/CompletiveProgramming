package Codeforces1000;

import java.util.Scanner;

public class MainakandArray {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        int min = -1;
        int max = -1;
        int []arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
            if(i == 0){
                min = 0;
                max = 0;
            }
            else{
                if(arr[min]>arr[i]){
                    min = i;
                }

                if(arr[max] < arr[i]){
                    max = i;
                }
            }
        }
        int ans = 0;
        if(n == 1){
            System.out.println("0");
        }
        else{

            ans = Math.max(ans,arr[n-1]-arr[0]);

            ans = Math.max(ans,arr[max]-arr[0]);
            ans = Math.max(ans,arr[n-1]-arr[min]);

            for (int i = 0; i <n-1 ; i++) {
                if(arr[max] == arr[i]){
                    ans = Math.max(ans,arr[i]-arr[i+1]);
                }
            }
            for (int i =n-1; i >0; i--) {
                if(arr[min] == arr[i]){
                    ans = Math.max(ans,arr[i-1]-arr[i]);
                }
            }
            for (int i = 0; i < n-1; i++) {
                ans = Math.max(ans,arr[i]-arr[i+1]);
            }

            System.out.println(ans);
        }


    }

}
