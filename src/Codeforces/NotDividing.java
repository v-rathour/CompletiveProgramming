package Codeforces;

import java.util.Scanner;

public class NotDividing {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);

        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        int []arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }

        for (int i = 1; i < n; i++) {
            if(arr[i]%arr[i-1] == 0){
                if(arr[i-1] == 1){
                    for (int j = i-1; j >=0 ; j--) {

                        if((arr[j] != 1) && (j-1)>=0 && arr[j+1]%arr[j] != 0){
                            System.out.println(arr[j]+" "+arr[j-1]);
                            break;
                        }
                        else{
                            arr[j] += 1;
                        }
                    }
                    if(arr[i]%arr[i-1] == 0){
                        arr[i] += 1;
                    }
                }
                else{
                    arr[i] += 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
