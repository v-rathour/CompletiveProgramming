package CodeForces_800;
//https://codeforces.com/problemset/problem/1828/A
import java.util.Scanner;

public class DivisibleArray {

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
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
            sum += arr[i];
        }

        int rem = sum%n;
        if(rem != 0){
            arr[rem-1] += arr[rem-1];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();
    }

}
