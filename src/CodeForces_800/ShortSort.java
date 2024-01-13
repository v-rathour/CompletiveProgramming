package CodeForces_800;

import java.util.Scanner;

public class ShortSort {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        String s = obj.next();
        String check = "abc";
        int count = 0;
        for(int i = 0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = check.charAt(i);
            if(ch1 != ch2){
                count++;
            }
        }

        if(count <=2){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }

}
