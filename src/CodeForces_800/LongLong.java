package CodeForces_800;

import java.util.Scanner;

public class LongLong {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        long arr[] =  new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextLong();
        }

        long count = 0;
        long sum = 0;
        for (int i = 0; i <n;) {
            int flag = 0;
            while( i<n && arr[i]<=0 ){
                if(arr[i]<0){
                    flag = 1;
                }
                sum += Math.abs(arr[i]);
                i++;
            }

            if(flag == 1){
                count++;
            }
            else{
                if(i<n){
                    sum += arr[i];
                }
                i++;
            }
        }
        System.out.println(sum+" "+count);
    }

}
