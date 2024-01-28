package Codeforces1000;

import java.util.Scanner;

public class PermutationSort {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();

        int arr[] = new int[n];
        int flag = 0;
        for(int i = 0;i<n;i++){
            arr[i] = obj.nextInt();
            if(arr[i]  != i+1){
                flag = 1;
            }
        }

        if(flag == 0){
            System.out.println(0);
            return ;
        }

        if(arr[0] == n && arr[n-1] == 1){
            System.out.println(3);
            return;
        }

        if(arr[0] == 1 || arr[n-1] == n){
            System.out.println(1);
            return;
        }

        System.out.println(2);

    }

}
