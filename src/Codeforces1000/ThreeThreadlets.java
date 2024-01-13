package Codeforces1000;

import java.util.Scanner;

public class ThreeThreadlets {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        long a = obj.nextLong();
        long b = obj.nextLong();
        long c = obj.nextLong();

        if(a == b && b == c){
            System.out.println("YES");
            return;
        }


        long min = Math.min(a,Math.min(b,c));
        int ans = 0;

        if(a%min == 0 && b%min == 0 && c%min == 0){
            if(min != a){
                ans += ((a/min)-1);
            }

            if(min != b){
                ans += ((b/min)-1);
            }
            if(min != c){
                ans += ((c/min)-1);
            }

            if(ans <=3){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
        else{
            if(min == 1){
                ans += (a-min);
                ans += (b-min);
                ans += (c-min);
                if(ans <= 3){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                System.out.println("NO");
            }



        }

    }

}
