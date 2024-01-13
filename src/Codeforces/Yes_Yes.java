package Codeforces;

import java.util.Scanner;

public class Yes_Yes {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        String s = obj.next();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == 'E' || ch == 'S'){
                System.out.println("NO");
                return;
            }
            else if(ch == 'e'){
                if((i+1)<s.length() && s.charAt(i+1) != 's'){
                    System.out.println("NO");
                    return;
                }

            }
            else if(ch == 'Y'){
                if((i+1)<s.length() && s.charAt(i+1) != 'e'){
                    System.out.println("NO");
                    return;
                }
            }
            else if(ch == 's') {
                if((i+1)<s.length() && s.charAt(i+1) != 'Y'){
                    System.out.println("NO");
                    return;
                }

            }
            else{
                System.out.println("NO");
                return;
            }


        }

        System.out.println("YES");

    }

}
