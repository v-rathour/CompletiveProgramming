package Codeforces1000;

import java.util.Arrays;
import java.util.Scanner;

public class BasketballTogether {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        solution(obj);
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        long d = obj.nextLong();
        long []arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextLong();
        }

        Arrays.sort(arr);
        int i = -1;
        int j = n-1;
        long temp = 0;
        temp += arr[n-1];
        long ans = 0;
        while(i<j){

            if(temp>d){
                ans++;
                temp = 0;
                j--;
                if(j>=0){
                    temp += arr[j];
                }
            }
            else{
                temp += arr[j];
                i++;
            }
        }

        System.out.println(ans);

    }

}
