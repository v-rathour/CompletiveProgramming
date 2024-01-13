package Codeforces1000;

import CodeForces_800.LongLong;

import java.util.Scanner;

public class LongComparison {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){
        long x1 = obj.nextLong();
        long p1 = obj.nextLong();
        long x2 = obj.nextLong();
        long p2 = obj.nextLong();

        String first = x1+"";
        String second = x2+"";

        long s1 = first.length()+p1;
        long s2 = second.length()+p2;

        if(s1 == s2){
            int i = 0;
            int j = 0;
            while(i<first.length() && j<second.length()){

                if(first.charAt(i) != second.charAt(j)){
                    if(first.charAt(i)>second.charAt(j)){
                        System.out.println(">");
                    }else{
                        System.out.println("<");
                    }
                    return;
                }
                i++;
                j++;
            }
            if(i == first.length()  && j == second.length()){
                System.out.println("=");
            }
            else if(i == first.length()){
                while(j<second.length()){
                    if(second.charAt(j) != '0'){
                        System.out.println("<");
                        return;
                    }
                    j++;
                }
                System.out.println("=");
            }
            else{
                while(i<first.length()){
                    if(first.charAt(i) != '0'){
                        System.out.println(">");
                        return;
                    }
                    i++;
                }

                System.out.println("=");
            }
        }
        else if(s1>s2){
            System.out.println(">");
        }
        else{
            System.out.println("<");
        }
    }

}
