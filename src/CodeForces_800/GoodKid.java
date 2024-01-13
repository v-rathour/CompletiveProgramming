package CodeForces_800;

import java.util.Scanner;

public class GoodKid {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        int arr[] = new int[n];

        long min = Long.MAX_VALUE;
        int idx = -1;
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
            if(min>arr[i]){
                min = arr[i];
                idx = i;
            }
        }

        long max = 1;
        for (int i = 0; i < n; i++) {
            if(i == idx){
                max *= arr[i]+1;
            }
            else{
                max *= arr[i];
            }
        }

        System.out.println(max);

    }


}
