package Codeforces1000;

import java.util.*;

public class MAX_MEXCut {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        String s1 = obj.next();
        String s2 = obj.next();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            if(ch1 != ch2){
                arr[i] = 2;
            }
            else{
                if(ch1 == '0'){
                    arr[i] = 1;
                }
                else{
                    arr[i] = 0;
                }
            }
        }

        boolean []visited = new boolean[n];
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if(visited[i]){
                continue;
            }

           if(arr[i] == 2){
               ans += 2;
               visited[i] = true;
           }
           else{
               if(arr[i] == 0){
                   if((i+1)<n && !visited[i+1] && arr[i+1] == 1){
                       visited[i+1] = true;
                       ans += 2;
                   }
                   else{
                       ans += arr[i];
                   }
               }
               else{
                   if((i+1)<n && !visited[i+1] && arr[i+1] == 0){
                       visited[i+1] = true;
                       ans += 2;
                   }
                   else{
                       ans += arr[i];
                   }
               }
           }
        }
        System.out.println(ans);

    }

}
