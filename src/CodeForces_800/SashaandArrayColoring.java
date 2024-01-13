package CodeForces_800;

import java.util.*;

public class SashaandArrayColoring {

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

        for(int i = 0;i<n;i++){
            arr[i] = obj.nextInt();
        }


        Arrays.sort(arr);
        int ans = 0;
        for (int i = 0; i < n/2; i++) {
            ans += (arr[n-1-i]-arr[i]);
        }

        System.out.println(ans);
    }

}
