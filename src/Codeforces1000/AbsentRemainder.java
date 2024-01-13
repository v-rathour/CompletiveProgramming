package Codeforces1000;

import java.util.Arrays;
import java.util.Scanner;

public class AbsentRemainder {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }

        Arrays.sort(arr);
        int k = arr[0];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if(k != arr[i]){
                System.out.println(arr[i]+" "+k);
                count++;
            }
            if(count == n/2)
                break;
        }



    }

}
