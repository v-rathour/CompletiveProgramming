package Codeforces1000;

import java.util.Arrays;
import java.util.Scanner;

public class DeadlyLaser {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        int m = obj.nextInt();

        int sx = obj.nextInt();
        int sy = obj.nextInt();

        int d = obj.nextInt();
        if(sx-d>1 && sy+d<m){
            System.out.println(n+m-2);
        }
        else if(sy-d>1 && sx+d<n){
            System.out.println(n+m-2);
        }
        else{
            System.out.println(-1);
        }
    }





}
