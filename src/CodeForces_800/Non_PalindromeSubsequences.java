package CodeForces_800;

import java.util.Scanner;

public class Non_PalindromeSubsequences {


    public static void main(String[] args) {
        Scanner obj  = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        String s = obj.next();
        int i = 0;
        int j = s.length()-1;

        while(i<j){

            if(s.charAt(i) != s.charAt(j)){
                break;
            }
            j--;

        }

        if(i == j){
            System.out.println("-1");
        }
        else{
            System.out.println(j-i+1);
        }

    }

}
