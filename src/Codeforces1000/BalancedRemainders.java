package Codeforces1000;

import java.util.Scanner;

public class BalancedRemainders {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        int zeros = 0;
        int ones = 0;
        int two = 0;

        for (int i = 0; i < n; i++) {
            int num = obj.nextInt();
            if(num%3 == 0){
                zeros++;
            }
            else if(num%3 == 1){
                ones++;
            }
            else{
                two++;
            }
        }

        if(zeros == ones && ones == two){
            System.out.println("0");
            return;
        }
        int set = n/3;
        int ans = 0;
        if(zeros<set){
            int temp = set-zeros;
            if(two>set){
                ans += solve(two,set,temp);
            }
            else{
                ans += (temp)*2;
            }

        }

        if(ones<set){
            int temp = set-ones;
            if(zeros>set){
                ans += solve(zeros,set,temp);
            }
            else{
                ans += ((temp)*2);
            }
        }

        if(two<set){
            int temp = set-two;
            if(ones>set){
                ans += solve(ones,set,temp);
            }
            else{
                ans += ((temp)*2);
            }
        }

        System.out.println(ans);

    }

    public static int solve(int val,int set,int temp ){
        int ans = 0;
        int k = Math.min(val-set,temp);
        ans += k;
        temp -= k;
        if(temp != 0){
            ans += ((temp)*2);
        }

        return ans;
    }

}
