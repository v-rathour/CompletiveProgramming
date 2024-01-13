package CodeForces_800;

import java.util.Scanner;

public class productArray_2023 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        int k = obj.nextInt();

        long pro = 1;

        for(int i = 0;i<n;i++){
            pro *= obj.nextLong();
        }

        if(pro>2023){
            System.out.println("NO");
            return;
        }

        if(2023%pro == 0){
            System.out.println("YES");
            System.out.print(2023/pro);
            for (int i = 0; i < k-1; i++) {
                System.out.print(" "+1);
            }
            System.out.println();
        }
        else{
            System.out.println("NO");
        }



    }

}
