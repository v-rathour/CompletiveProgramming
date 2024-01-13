package Codeforces1000;

import java.util.Scanner;

public class X_Sum {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        int m = obj.nextInt();

        int [][]arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = obj.nextInt();
            }
        }

        long ans = Long.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                long sum = 0;
                for (int k = i-1,l = j-1; k>=0 && l>=0 ; k--,l--) {
                     sum += arr[k][l];
                }

                for (int k = i-1,l=j+1; k >= 0 && l<m ; k--,l++) {
                    sum += arr[k][l];
                }

                for (int k = i+1,l=j-1; k <n && l>=0 ; k++,l--) {
                    sum += arr[k][l];
                }

                for (int k = i+1,l=j+1; k <n && l<m ; k++,l++) {
                    sum += arr[k][l];
                }

                sum += arr[i][j];

                ans = Math.max(ans,sum);

            }
        }

        System.out.println(ans);

    }

}
