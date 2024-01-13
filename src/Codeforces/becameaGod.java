package Codeforces;

import java.util.Scanner;

public class becameaGod {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        int m = obj.nextInt();
        int k = obj.nextInt();
        int H = obj.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            int hdiff = Math.abs(arr[i] - H);
            if(hdiff%k == 0){
                if(hdiff/k<m && hdiff/k != 0){
                    ans ++;
                }
            }
        }

        System.out.println(ans);
    }
}
