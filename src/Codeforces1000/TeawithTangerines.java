package Codeforces1000;

import java.util.Arrays;
import java.util.Scanner;

public class TeawithTangerines {

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
        for (int i = 0; i < n; i++) {
            a[i] = obj.nextInt();
        }

        Arrays.sort(a);
        int ans = 0;
        int val = (2*a[0])-1;
        for (int i = 1; i < n; i++) {
            int count = 0;

            if(a[i]%val == 0){
                count = a[i]/val;
            }
            else{
                count = a[i]/val;
                count++;
            }
            ans += count-1;
        }

        System.out.println(ans);

    }

}
