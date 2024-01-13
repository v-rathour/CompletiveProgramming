package Codeforces1000;

import java.util.Scanner;

public class SumofThree {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();

        if(n <=6){
            System.out.println("NO");
            return;
        }

        long []arr = new long[3];
        arr[0] = 1;
        arr[1] = 2;
        long rem = n - 3;
        arr[2] = rem;
        while(arr[1]%3 == 0 || arr[2]%3 == 0){
            arr[1]++;
            arr[2]--;
            if(arr[1] == arr[2]){
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
        System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);

    }

}
