package CodeForces_800;

import java.util.Arrays;
import java.util.Scanner;

public class GoingCinema {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            Solution(obj);
        }
    }

    public static void Solution(Scanner obj){

        int n = obj.nextInt();
        int []arr = new int[n];
        int flag = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
            if(i>0  && arr[i-1] != arr[i]){
                flag = 1;
            }
        }

        Arrays.sort(arr);

        int ans = 0;
        int people = -1;

        for (int i = 0; i < n; i++) {
            if(people>=arr[i]){
                people += arr[i];
            }
            else{
                ans++;
                people = arr[i];
                if(arr[i] == 0){
                    people += 1;
                }
            }
        }

        if(flag == 0){
            System.out.println(ans+1);
        }
        else{
            System.out.println(ans);
        }

    }


}
