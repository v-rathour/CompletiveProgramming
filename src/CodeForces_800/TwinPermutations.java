package CodeForces_800;

import java.util.Scanner;

public class TwinPermutations {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        int arr[] = new int[n];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            int num = obj.nextInt();
            min = Math.min(num,min);
            max = Math.max(num,max);
            arr[i] = num;

        }

        int sum = min+max;
        for (int i = 0; i < n; i++) {
            System.out.print(sum-arr[i]+" ");
        }
        System.out.println();

    }

}
