package CodeForces_800;
//https://codeforces.com/problemset/problem/1841/B
import java.util.Scanner;

public class KeepitBeautiful {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        StringBuilder ans = new StringBuilder("");
        long first = 0;
        long last = 0;
        int flag = 0;

        for (int i = 0; i < n; i++) {
            int num = obj.nextInt();
            if(i == 0){
                first = num;
                last = num;
                ans.append("1");
            }
            else if(last <= num && flag != 1){
                last = num;
                ans.append("1");
            }
            else if(last <= num && first >= num && flag ==1){
                last = num;
                ans.append("1");
            }
            else if(last > num && first >= num && flag ==0){
                flag = 1;
                ans.append("1");
                last = num;
            }
            else{
                ans.append("0");
            }
        }

        System.out.println(ans);

    }



}
