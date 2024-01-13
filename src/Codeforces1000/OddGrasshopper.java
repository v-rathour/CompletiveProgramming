package Codeforces1000;

import java.util.Scanner;

public class OddGrasshopper {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj) {
        long x = obj.nextLong();
        long j = obj.nextLong();

        long y = j%4;
        long z = 0;
        if(y == 1){
            z = -j;
        }
        else if(y == 2){
            z = 1;
        }
        else if(y == 3){
            z = j+1;
        }

        if(x%2 != 0){
            System.out.println(x-z);
        }
        else{
            System.out.println(x+z);
        }
    }

}
