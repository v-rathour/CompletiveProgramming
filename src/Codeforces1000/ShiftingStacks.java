package Codeforces1000;

import java.util.Scanner;

public class ShiftingStacks {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        int zeros = 0;
        long sum = 0;
        long elesum = 0;
        int flag = 0;
        for(int i = 0;i<n;i++){
           sum += i;
           long temp = obj.nextLong();
           elesum += temp;
           if(sum>elesum){
               flag = 1;
           }
        }



        if(flag == 0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }

}
