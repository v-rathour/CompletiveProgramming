package Codeforces;

import java.util.Scanner;

public class Channel {

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int t = scanner .nextInt();

        while(t-->0){
            Solution(scanner );
        }
    }

    public static void Solution(Scanner scanner ){

        int subs = scanner .nextInt();
        int online = scanner .nextInt();
        int notfi = scanner .nextInt();

        String s = scanner .next();
        if(subs == online){
            System.out.println("YES");
            return;
        }

        int read = online;
        int flag = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch != '+'){
                read--;
            }
            else{
                online++;
                read++;
            }

            if(read == subs){
                flag = 1;
                break;
            }

        }

        if(flag == 1){
            System.out.println("YES");
        }
        else{
            if(online >= subs){
                System.out.println("MAYBE");
            }
            else{
                System.out.println("NO");
            }
        }

    }

}
