package Codeforces1000;

import java.util.*;

public class LanguageProcessing {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        StringBuilder s = new StringBuilder(obj.next());
        List<String> list = new ArrayList<>();
        for(int i = n-1;i>=0;i--) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e'){

                list.add(s.charAt(i-1)+""+ch);
                i--;
            }
            else{
                list.add(s.charAt(i-2)+""+s.charAt(i-1)+""+ch);
                i -= 2;
            }
        }

       for(int i = list.size()-1;i>=0;i--){
           System.out.print(list.get(i));
           if(i != 0){
               System.out.print(".");
           }
       }
        System.out.println();
    }

}
