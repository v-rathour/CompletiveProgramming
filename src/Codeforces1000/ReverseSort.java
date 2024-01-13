package Codeforces1000;

import java.util.Scanner;

public class ReverseSort {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        String s = obj.next();

        char []arr = new char[s.length()];
        for(int i = 0;i<arr.length;i++){
            arr[i] = s.charAt(i);
        }

        int flag = 0;
        for (int i = 0; i < n-1; i++) {
            if(arr[i]>arr[i+1]){
                flag = 1;
            }
        }

        if(flag == 0){
            System.out.println("0");
            return;
        }

        int i = 0;
        int j = n-1;
        String s1 = "";
        String s2 = "";
        int k = 0;
        while(i<j){

            if(arr[i] == '1' ){

                while(i<j && arr[j] != '0'){
                    j--;
                }
                if(i != j){
                    s1 += (i+1)+" ";
                    s2 = (j+1)+" "+s2;
                    k++;
                }
                j--;
            }
            i++;
        }

        System.out.println(1);
        System.out.println((k*2)+" "+s1+s2);

    }

}
