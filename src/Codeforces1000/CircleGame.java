package Codeforces1000;

import java.util.Scanner;

public class CircleGame {

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
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextLong();
        }


        if(n%2 != 0){
            System.out.println("Mike");
            return;
        }

        int min = -1;
        for (int i = 0; i < n; i++) {
            if(min == -1 || arr[min]>arr[i]){
                min = i;
            }
        }

        if(min%2 != 0){
            System.out.println("Mike");
        }
        else{
            System.out.println("Joe");
        }

    }
}
