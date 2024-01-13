package Codeforces1000;

import java.util.Scanner;

public class IndirectSort {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        int []nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = obj.nextInt();
        }

        if(nums[0] != 1){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }

    }

}
