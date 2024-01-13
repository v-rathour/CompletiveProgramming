package Codeforces;

import java.util.Scanner;

public class FlipFlopSum {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        int sum = 0;
        int negones = 0;
        int []arr = new int[n];
        for (int i = 0; i < n; i++) {
            int num = obj.nextInt();
            arr[i] = num;
            if(num == -1){
                if(negones == 0){
                    negones++;
                }
                else if(arr[i-1] == -1){
                    negones++;
                }
            }

            sum += num;
        }

        if(negones == 0){
            sum -= 4;
            System.out.println(sum);
            return;
        }

        if(negones == 1){
            System.out.println(sum);
            return;
        }

        sum += 4;
        System.out.println(sum);


    }

}
