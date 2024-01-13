package Codeforces1000;

import java.util.Scanner;

public class MakeItIncreasing {

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


        for (int i = 0; i < n; i++) {
            if(arr[i]<i){
                System.out.println("-1");
                return;
            }
        }

        int ans = 0;

        int []store = new int[n];
        store[n-1] = arr[n-1];

        for (int i = n-2; i >=0; i--) {
            if(arr[i]>=store[i+1]) {
                int count = 0;
                int copy = arr[i];
                while(copy>=store[i+1]){
                    copy /= 2;
                    count++;
                }

                if(copy<i){
                    System.out.println("-1");
                    return;
                }
                store[i] = copy;
                ans += count;
            }
            else{
                store[i] = arr[i];
            }
        }

        System.out.println(ans);



    }

}
