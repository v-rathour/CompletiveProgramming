package CodeForces_800;

import java.util.Scanner;
import java.util.Stack;

public class NotaSubstring {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        String s = obj.next();

        if(s.equals("()")){
            System.out.println("NO");
            return;
        }


        int flag = 0;
        for (int i = 0; i < s.length()-1; i++) {
            char ch = s.charAt(i);
            if(ch == ')' && s.charAt(i+1) == '('){
                flag = 1;
                break;

            }
        }

        if(flag == 1){
            System.out.println("YES");
            for (int i = 0; i < s.length(); i++) {
                System.out.print("(");
            }

            for (int i = 0; i < s.length(); i++) {
                System.out.print(")");
            }
            System.out.println();
        }
        else{
            System.out.println("YES");
            for (int i = 0; i < s.length(); i++) {
                System.out.print("()");
            }
            System.out.println();
        }
    }

}
