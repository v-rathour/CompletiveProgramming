package CodeForces_800;

import java.util.Scanner;

public class Ski_Resort {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        long k = obj.nextLong();
        long q = obj.nextLong();

        long arr[] = new long[n];
        for(int i = 0;i<n;i++){
            arr[i] = obj.nextLong();
        }
        long count = 0;
        long ans = 0;
        long max = 0;
        for (int i = 0; i < n; i++) {
            if(Math.max(max,arr[i])<=q){
                count++;
                max = Math.max(max,arr[i]);
            }
            else{
                if(count>=k){
                    long temp1 = count-k+1;
                    long temp2 = (temp1*(temp1+1))/2;
                    ans += temp2;
                }
                count = 0;
                max = 0;
                if(arr[i]<=q){
                    max = arr[i];
                    count = 1;
                }
            }
        }

        if(count>=k){
            long temp1 = count-k+1;
            long temp2 = (temp1*(temp1+1))/2;
            ans += temp2;
        }
            System.out.println(ans);

    }

}
