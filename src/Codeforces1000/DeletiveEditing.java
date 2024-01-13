package Codeforces1000;

import java.util.*;
import java.util.Scanner;

public class DeletiveEditing {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        String s = obj.next();
        String t = obj.next();

        HashMap<Character,List<Integer>> map = new HashMap<>();
        for (int i = s.length()-1; i >=0 ; i--) {
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,new ArrayList<>());
                map.get(ch).add(i);
            }
            else{
                map.get(ch).add(i);
            }
        }


        HashMap<Character,List<Integer>> mp =new HashMap<>();
        for (int i = 0; i <t.length(); i++) {
            char ch = t.charAt(i);
            if(!map.containsKey(ch)){
                System.out.println("NO");
                return;
            }

            if(map.get(ch).size() == 0){
                System.out.println("NO");
                return;
            }
            int temp = map.get(ch).remove(0);
            if(!mp.containsKey(ch)){
                mp.put(ch,new ArrayList<>());
                mp.get(ch).add(temp);
            }
            else{
                mp.get(ch).add(temp);
            }
        }

        for(char ch : mp.keySet()){
            Collections.sort(mp.get(ch));
        }
//        System.out.println(mp);

        int []ans = new int[t.length()];
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            int temp = mp.get(ch).remove(0);
            if(i == 0){
                ans[i] = temp;
            }
            else if(ans[i-1]<temp){
                ans[i] = temp;
            }
            else{
                System.out.println("NO");
                return;
            }

        }
        System.out.println("YES");

    }

}
