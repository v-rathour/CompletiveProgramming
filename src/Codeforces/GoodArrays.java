package Codeforces;

import java.util.Scanner;

public class GoodArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while(t-->0){
            solve(scanner);
        }
    }

    public static void solve(Scanner scanner){

        int n = scanner.nextInt();


        long nums[] = new long[n];
        int ones = 0;
        for (int i = 0; i < n; i++) {
            long num = scanner.nextLong();
            if(num == 1){
                ones++;
            }
            nums[i] = num;
        }

        if(n == 1){
            System.out.println("NO");
            return;
        }

        int half = n/2;
        if(ones > half){
            long sum = 0;
            for (int i = 0; i < n; i++) {
                if(nums[i] != 1){
                    sum += nums[i];
                }
            }

            if(sum < n){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
            return;
        }
        System.out.println("YES");
    }

}
