package CodeForces_800;

import java.util.Scanner;

public class IsItaCat {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }

    }

    public static void solve(Scanner obj){
        int n = obj.nextInt();
        String s = obj.next();

        String target = "meow";
        s = s.toLowerCase();

        String str = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(i == 0 || s.charAt(i-1) != ch){
                str += ch;
            }
        }

        if (str.length() != 4){
            System.out.println("NO");
            return;
        }

        for (int i = 0; i < target.length(); i++) {
            if(target.charAt(i) != str.charAt(i)){
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }

}
