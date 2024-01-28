

package Codeforces;

import java.util.Scanner;

public class GoodNumbers {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        long a = obj.nextLong();
        long b = obj.nextLong();

        if(b == 1){
            System.out.println("NO");
            return;
        }

        long x = (a*b);
        long y = (a*(b+1));
        long z = x+y;
        System.out.println("YES");
        System.out.println(x+" "+y+" "+z);

    }

}
