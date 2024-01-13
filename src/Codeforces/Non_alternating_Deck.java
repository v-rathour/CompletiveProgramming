package Codeforces;

import java.util.Scanner;

public class Non_alternating_Deck {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int card = obj.nextInt();
        int flag = 1;
        int Alice = 1;
        int Bob = 0;
        card -= 1;

        int idx = 0;
        int i = 2;
        while(card != 0){

            if(flag == 1){
                idx++;
                if(i <= card){
                    Bob += i;
                    card -= i;
                }
                else{
                    Bob += card;
                    card = 0;
                }

            }

             if(flag == 0){
                idx++;
                if(i <= card){
                    Alice += i;
                    card -= i;
                }
                else{
                    Alice += card;
                    card = 0;
                }


            }
            i++;
            if(idx == 2){
                flag = flag == 1?0:1;
                idx = 0;
            }

        }
        System.out.println(Alice+" "+Bob);

    }

}
