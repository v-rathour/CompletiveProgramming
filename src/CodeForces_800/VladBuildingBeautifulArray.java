package CodeForces_800;
//https://codeforces.com/problemset/problem/1833/C
import java.util.Scanner;

public class VladBuildingBeautifulArray {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){
        int n = obj.nextInt();
        int even = -1;
        int odd = -1;

        for (int i = 0; i < n; i++) {
            int num = obj.nextInt();
            if(num%2 == 0){
                even = (even == -1)?num:Math.min(even,num);
            }
            else{
                odd = (odd == -1)?num:Math.min(odd,num);
            }
        }
        if(even<odd && even != -1){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }

    }

}
