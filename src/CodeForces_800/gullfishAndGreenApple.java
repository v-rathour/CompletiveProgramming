package CodeForces_800;

import java.util.Scanner;

public class gullfishAndGreenApple {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){

            solve(obj);

        }

    }

    public static void solve(Scanner obj){

        String s1 = obj.next();
        String s2 = obj.next();
        int flag = 0;
        for (int i = 0; i < s1.length()-1; i++) {
            if(s1.charAt(i) == '0' && s2.charAt(i)  == '0' && s1.charAt(i+1)  == '1' && s2.charAt(i+1)  == '1'){
                flag = 1;
                break;
            }
        }

        if(flag == 1){
            System.out.println("YES");
            return;
        }
        System.out.println("NO");

    }

}
