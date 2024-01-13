package CodeForces_800;

import java.util.Scanner;

public class InsertDigit {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        int d = obj.nextInt();

        String s = obj.next();
        int i = 0;
        for (; i < s.length(); i++) {
            char ch = s.charAt(i);
            if((ch-'0')<d){
                break;
            }
        }

        String left = s.substring(0,i);
        String right = s.substring(i);
        String str = left+d+right;
        System.out.println(str);

    }

}
