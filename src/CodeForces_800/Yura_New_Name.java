package CodeForces_800;

import java.util.Scanner;

public class Yura_New_Name {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }

    }

    public static void solve(Scanner obj){

        String str = obj.next();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if(i == 0){

                if(str.length() == 1){
                    if(str.charAt(0) == '_'){
                        System.out.println("2");
                    }
                    else{
                        System.out.println("1");
                    }
                    return;
                }

                if(str.charAt(i) == '_'){
                    if(str.charAt(i+1) != '^'){
                        count++;
                    }
                    count++;
                }
            }
            else if(i == str.length()-1){
                if(str.charAt(i) != '^')
                       count++;
            }
            else{
                if(str.charAt(i) == '_' && str.charAt(i+1) != '^'){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}
