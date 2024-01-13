package Codeforces;

import java.util.Scanner;

public class DifferentDifferences {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            solution(sc);
        }
    }

    public static void solution(Scanner sc){

        int k = sc.nextInt();
        int n = sc.nextInt();

        System.out.print(1+" ");
        int previous = 1;
        int j = 1;
        k--;
        while(k != 0){

            if((previous+j)<=(n+1-k)){
                System.out.print((previous+j)+" ");
                previous += j;
            }
            else{
                System.out.print(previous+1+" ");
                previous++;
            }
            j++;
            k--;
        }
        System.out.println();

    }

}
