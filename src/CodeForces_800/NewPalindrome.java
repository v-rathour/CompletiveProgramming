package CodeForces_800;

import java.util.*;

public class NewPalindrome {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){
        String str = obj.next();
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
           if(!map.containsKey(ch)){
               map.put(ch,1);
           }
           else{
               map.put(ch,map.get(ch)+1);
           }
        }

        if(map.size() == 1){
            System.out.println("NO");
        }
        else if(map.size() == 2){
            for (char ch : map.keySet()) {
                if(map.get(ch) == 1){
                    System.out.println("NO");
                    return;
                }
            }

            System.out.println("YES");
        }
        else{
            System.out.println("YES");
        }

    }



}
