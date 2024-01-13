package CodeForces_800;

import java.util.Scanner;

public class YetAnotherPromotion {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

       long a = obj.nextLong();
       long b = obj.nextLong();

       long n = obj.nextLong();
       long m = obj.nextLong();

       if(n<=m){
           System.out.println(Math.min(a,b)*n);
           return;
       }

       if((m*a) <= ((m+1)*b)){
           long temp1 = n/(m+1);
           long temp2 = n%(m+1);
           long temp3 = temp1*m*a;

           temp3 += temp2*Math.min(a,b);
           System.out.println(temp3);
       }
       else{
           System.out.println(Math.min(a,b)*n);
       }

    }

}
