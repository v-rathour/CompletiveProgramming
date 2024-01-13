package Codeforces1000;

import java.util.Scanner;

public class RedVersusBlue {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        int r = obj.nextInt();
        int b = obj.nextInt();

        int temp = b+1;
        int div = r/temp;
        int rem = r%temp;

        String s = "";
        for (int i = 0; i < div; i++) {
            s += 'R';
        }

        String ans = "";
        while(b-->0){
            if(rem != 0){
                ans += s+'R'+'B';
                rem--;
            }
            else{
                ans += s+'B';
            }
        }
        ans += s;

        System.out.println(ans);

    }

}
