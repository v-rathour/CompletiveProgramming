package Codeforces;

import java.util.Scanner;

public class Split {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int n = obj.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }

        int q = obj.nextInt();
        while(q-->0){

            int l = obj.nextInt()-1;
            int r = obj.nextInt();
            int max = arr[l];
            int ans = 0;
            while(l<r){
                int start = max;
                while(l<r && start<= arr[l]){
                    max = Math.max(max,arr[l]);
                    l++;

                }

                if(l == r){
                    ans = 1;
                    System.out.println("YES");
                    break;
                }

            }
            if(ans == 0){
                System.out.println("NO");
            }
        }
    }

}


