package Codeforces1000;

import java.util.Scanner;

public class Split_it {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }

    }

    public static void solution(Scanner obj){
        int n = obj.nextInt();
        int k = obj.nextInt();

        StringBuilder s = new StringBuilder(obj.next());
        if(n>=((2*k)+1)){
            int start = 0;
            int last = n-1;
            while(start<k){
                if(s.charAt(start) != s.charAt(last)){
                    System.out.println("NO");
                    return;
                }
                start++;
                last--;
            }

            System.out.println("YES");

        }
        else{
            System.out.println("NO");
        }
    }

}
