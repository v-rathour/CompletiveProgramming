package CodeForces_800;

import java.util.Scanner;

public class Blackboard_List {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
             solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        long arr[] = new long[n];

        long max = -1;
        long min = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextLong();
            min = Math.min(min,arr[i]);
            max = Math.max(arr[i],max);
        }

        if(min<0){
            System.out.println(min);
        }
        else{
            System.out.println(max);
        }

        return ;

    }

}
