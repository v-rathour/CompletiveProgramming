package CodeForces_800;

import java.util.Scanner;

public class Cipher_Shifer {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }


    public static void solve(Scanner obj){

        int length = obj.nextInt();
        String s = obj.next();
        String str = "";
        for (int i = 0; i < length;) {

            char ch = s.charAt(i);
            int j = i+1;
            while(j<s.length() && s.charAt(j) != ch){
                j++;
            }

            if(j<s.length()){
                if(ch == s.charAt(j)){
                    str += ch;
                    j++;
                }
            }
            i = j;


        }
        System.out.println(str);

    }
}
