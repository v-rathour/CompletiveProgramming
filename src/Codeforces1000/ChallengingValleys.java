package Codeforces1000;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChallengingValleys {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        List<Integer> list = new ArrayList<>();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if(i == 0){
                list.add(obj.nextInt());
            }
            else{
                int temp = obj.nextInt();
                if(temp != list.get(list.size()-1)){
                    list.add(temp);
                }
            }
        }

        if(list.size() == 1){
            System.out.println("YES");
            return;
        }

        if(list.get(0)<list.get(1)){
            count++;
        }

        for (int i = 1; i < list.size()-1; i++) {
            if(list.get(i-1)>list.get(i) && list.get(i)<list.get(i+1)){
                count++;
            }
        }

        if(list.get(list.size()-2)>list.get(list.size()-1)){
            count++;
        }

        if(count == 1){
           System.out.println("YES");
        }
        else{
           System.out.println("NO");
        }


    }



}
