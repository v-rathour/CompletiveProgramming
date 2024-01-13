package CodeForces_800;

import java.util.Arrays;
import java.util.Scanner;

public class TaisiaandDice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            solved(sc);
        }
    }

    public static void solved(Scanner sc){

        int dice = sc.nextInt();
        int total_sum = sc.nextInt();
        int remaining = sc.nextInt();

        int arr[] = new int[dice];
        int last = total_sum-remaining;
        int n = dice-1;
        int div = remaining/n;
        remaining %= n;
        Arrays.fill(arr,div);


        if(remaining != 0 ){
            for (int i = 1; i < dice; i++) {
                if(remaining == 0){
                    break;
                }

                int temp = 6 - arr[i];
                if(temp<remaining){
                    while(last<(arr[i]+temp))
                        temp--;
                    arr[i] += temp;
                    remaining -= temp;
                }
                else{
                    int temp2 = remaining;
                    while(last<(arr[i]+temp2))
                        temp2--;
                    arr[i] += temp2;
                    remaining -= temp2;
                }
            }
        }
        arr[0] = last;
        for (int i = 0; i < dice; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();



    }

}
