package Codeforces;

import java.util.Scanner;

public class MexMaster {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int n  = obj.nextInt();
        int zero = 0;
        int ones = 0;
        int other = 0;

        for (int i = 0; i < n; i++) {
            int num = obj.nextInt();

            if(num == 0){
                zero++;
            }
            else if(num == 1){
                ones++;
            }
            else{
                other++;
            }
        }

        if((other+ones+1) < zero){

            if(ones == 0){
                System.out.println("1");
            }
            else {
                if(other >=1){
                    System.out.println("1");
                }else{
                    System.out.println("2");
                }

            }
        }
        else{
            System.out.println("0");
        }

    }

}
