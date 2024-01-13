package CodeForces_800;

import java.util.Scanner;

public class Showstopper {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = obj.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = obj.nextInt();
        }

        for (int i = 0; i < n-1; i++) {
            if(a[i] > a[n-1]){
                if(b[i] <= a[n-1] && a[i] <= b[n-1]){
                    int temp = a[i];
                    a[i] = b[i];
                    b[i] = temp;
                }
                else{
                    System.out.println("NO");
                    return;
                }
            }

        }

        for (int i = 0; i < n-1; i++) {
            if(b[i] > b[n-1]){
                if(a[i] <= b[n-1] && b[i] <= a[n-1]){
                    int temp = a[i];
                    a[i] = b[i];
                    b[i] = temp;
                }
                else{
                    System.out.println("NO");
                    return;
                }
            }

        }

        System.out.println("YES");

    }

}
