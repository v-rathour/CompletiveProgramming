package CodeForces_800;

import java.util.Scanner;

public class OddQueries {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int n= obj.nextInt();
        int q = obj.nextInt();

        long arr[] = new long[n];

        for (int i = 0; i < n; i++) {

            int x = obj.nextInt();
            if(i>=1){
                arr[i] += arr[i-1]+x;
            }
            else{
                arr[i] = x;
            }

        }

        for(int i = 0;i<q;i++){

            int left = obj.nextInt();
            int right = obj.nextInt();
            long k = obj.nextLong();
            left--;
            right--;

            long prev = 0;
            if (left>0){
                prev = arr[left-1];
            }
            long curr = (right-left+1)*k;
            long next = arr[n-1]-arr[right];
            long res = curr+next+prev;
            if((res%2 != 0)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }

    }

}
