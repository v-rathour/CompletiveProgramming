package CodeForces_800;

import java.util.Scanner;

public class D1_Eraser {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        int k = obj.nextInt();

        String str = obj.next();
        int count = 0;
        for (int i = 0; i < str.length(); ) {
            int flag = 0;
            int l = k+i;
            if(str.charAt(i) == 'B'){
                while(i<l && i<str.length()){
                    char ch = str.charAt(i);

                    if(ch == 'B'){
                        flag = 1;
                    }

                    i++;
                }
            }

            if(flag == 1){
                count++;
            }
            else{
                i++;
            }

        }
        System.out.println(count);


    }

}
