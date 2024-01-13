
package Codeforces1000;

import java.util.Scanner;

public class BeautifulArray {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        long k = obj.nextLong();
        long b = obj.nextLong();
        long s = obj.nextLong();

        long sum = k*b;
        if(sum>s || s>(sum+n*(k-1))){
            System.out.println("-1");
            return;
        }

        long []arr = new long[n];
        arr[0] = sum;
        s -= sum;

        if(s>0){
            arr[0] += Math.min(s,k-1);
            s -= Math.min(s,k-1);
        }

        for(int i = 1;i<n;i++){
            if(s>0){
                long temp = Math.min(s,k-1);
                arr[i] = temp;
                s -= temp;
            }
            else{
                arr[i] = 0;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

}
