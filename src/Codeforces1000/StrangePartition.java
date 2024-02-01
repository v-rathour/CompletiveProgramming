package Codeforces1000;

import java.util.Scanner;

public class StrangePartition {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        int k = obj.nextInt();

        long []arr = new long[n];

        long sum = 0;
        long maxi = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
            sum += arr[i];
            maxi += (arr[i]%k == 0)?arr[i]/k:((arr[i]/k)+1);

        }

        long min = sum%k == 0?sum/k:sum/k+1;
        System.out.println(min+" "+maxi);
    }

}
