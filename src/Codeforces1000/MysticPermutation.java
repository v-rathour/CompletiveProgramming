package Codeforces1000;

import java.util.Arrays;
import java.util.Scanner;

public class MysticPermutation {

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
        int []temp = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
            temp[i] = arr[i];
        }

        if(n == 1){
            System.out.println("-1");
            return;
        }

        Arrays.sort(temp);

        for (int i = 0; i < n; i++) {
            if(arr[i] == temp[i]){
                if(i == n-1){
                    int c = temp[i];
                    temp[i] = temp[i-1];
                    temp[i-1] = c;
                }
                else{
                    int c = temp[i];
                    temp[i] = temp[i+1];
                    temp[i+1] = c;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(temp[i]+" ");
        }
        System.out.println();

    }

}
