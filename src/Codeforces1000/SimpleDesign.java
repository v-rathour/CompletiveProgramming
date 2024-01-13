package Codeforces1000;

import java.util.Scanner;

public class SimpleDesign {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int x = obj.nextInt();
        int k = obj.nextInt();

        long copy = x;
        long sum = 0;


        int i = x;
        while(i<=(x+20)){
            copy = i;
            sum = 0;
            while(copy != 0){
                long rem = copy%10;
                sum += rem;
                copy /= 10;
            }

            if(sum%k == 0){
                System.out.println(i);
                return;
            }
            i++;
        }

    }

}
