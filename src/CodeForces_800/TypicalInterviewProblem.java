package CodeForces_800;

import java.util.Scanner;

public class TypicalInterviewProblem {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        String str = obj.next();
        String s = "";

        for (int i = 1; i <= 50 ; i++) {
            if(i%3 == 0){
                s += "F";
            }

            if(i%5 == 0)
                s += "B";
        }
        System.out.println(s);

        int m = s.length();

        for (int i = 0; i <m-n+1 ; i++) {

            int j = 0;
            for (; j < n; j++) {
                if(s.charAt(i+j) != str.charAt(j)){
                    break;
                }
            }

            if(j == n){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");

    }

}
