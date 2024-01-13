package Codeforces1000;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TwoArrays {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();

        int []a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = obj.nextInt();
        }

        int []b = new int[n];

        for (int i = 0; i < n; i++) {
            b[i] = obj.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < n; i++) {

//            System.out.println("HO");
            if((a[i]>b[i]) || (b[i]-a[i])>1){

                System.out.println("NO");
                return;

            }

        }
        System.out.println("YES");



    }

}
