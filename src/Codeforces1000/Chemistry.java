package Codeforces1000;

import java.util.HashMap;
import java.util.Scanner;

public class Chemistry {

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

        String s = obj.next();

        HashMap<Character,Integer> map = new HashMap<>();
        fillCharacter(map,s);

        int even = 0;
        int odd = 0;

        for(char ch : map.keySet()){
            if(map.get(ch)%2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }

        if(odd == 0){
            System.out.println("YES");
        }
        else{
            if(odd <= k){
                System.out.println("YES");
            }
            else{
                if(odd-k == 1){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }

    public static void fillCharacter(HashMap<Character,Integer> map,String s){



        for (int k = 0; k < s.length(); k++) {
            char ch = s.charAt(k);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                map.put(ch,map.get(ch)+1);
            }
        }

    }

}
