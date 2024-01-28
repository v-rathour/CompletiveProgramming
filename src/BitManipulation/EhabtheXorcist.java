package BitManipulation;

import java.util.Scanner;

public class EhabtheXorcist {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        solution(obj);
    }

    public static void solution(Scanner obj){
        long u = obj.nextLong();
        long v = obj.nextLong();


        if(u>v || (v-u)%2 != 0){
            System.out.println(-1);
            return;
        }
         else if(u == v){
            if( u == 0){
                System.out.println(0);
            }
            else{
                System.out.println("1");
                System.out.println(v);
            }
        }
         else{
            long x = (v-u)/2;
            if((u&x) != 0){
                System.out.println("3");
                System.out.println((u+" "+x+" "+x));
            }else{
                System.out.println(2);
                System.out.println((u+x)+" "+x);
            }
        }













    }

}
