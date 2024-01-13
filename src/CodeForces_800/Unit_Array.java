package CodeForces_800;
//https://codeforces.com/problemset/problem/1834/A

import java.util.Scanner;

public class Unit_Array {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){
        int n = obj.nextInt();
        int pos = 0;
        int neg = 0;

        for (int i = 0; i < n; i++) {
            int num = obj.nextInt();
            if(num == -1){
                neg++;
            }
            else{
                pos++;
            }
        }
        int ans = 0;
        while(neg>pos){
            neg--;
            pos++;
            ans++;
        }

        if(neg%2 == 1){
            ans++;
        }
        System.out.println(ans);

    }

}
