package Codeforces;

import java.util.Scanner;

public class Football {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int match = sc.nextInt();
        int goal =sc.nextInt();
        int cancel = sc.nextInt();

        if(match == 1){
            if(goal==cancel){
                System.out.println(1);
                System.out.println(goal+":"+cancel);
            }
            else{
                System.out.println(0);
                System.out.println(goal+":"+cancel);
            }
            return;
        }


        if((goal+cancel) <= match){
            System.out.println(match-(goal+cancel));
            for (int i = 0; i < match; i++) {
                if(goal != 0){
                    System.out.println("1:0");
                    goal--;
                }
                else if(cancel != 0){
                    System.out.println("0:1");
                    cancel--;
                }
                else{
                    System.out.println("0:0");
                }
            }
            return;
        }
        System.out.println(0);
        if(goal<match){
            for (int i = 0; i < goal; i++) {
                System.out.println("1:0");
            }

            for (int i = 0; i < (match-goal); i++) {
                if(i == (match-goal-1)){
                    System.out.println("0:"+cancel);
                }
                else{
                    System.out.println("0:1");
                    cancel--;
                }
            }
        }
        else if(cancel != 0){
            for (int i = 0; i < match-1; i++) {
                if(i == match-2){
                    System.out.println(goal+":0");
                }
                else{
                    System.out.println("1:0");
                    goal--;
                }
            }
            System.out.println("0:"+cancel);
        }
        else{
            for (int i = 0; i < match; i++) {
                if(i == match-1){
                    System.out.println(goal+":0");
                }
                else{
                    System.out.println("1:0");
                    goal--;
                }
            }
        }

    }

}
