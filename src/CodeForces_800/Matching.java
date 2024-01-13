package CodeForces_800;

import java.util.Scanner;

public class Matching {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            solve(sc);
        }
    }

    public static void solve(Scanner sc){

        String str = sc.next();
        if(str.charAt(0) == '0'){
            System.out.println("0");
            return;
        }

        int count = 1;
        for (int len = 0; len < str.length(); len++) {
            char ch = str.charAt(len);

            if(ch == '?'){
                if(len>0){
                    count *= 10;
                }
                else{
                    count *= 9;
                }
            }
        }

        System.out.println(count);

    }
}
