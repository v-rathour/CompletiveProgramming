package Codeforces1000;

import java.util.*;

public class NotaCheapString {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < 26; i++) {
            char ch = (char)(97+i);
            map.put(ch,i+1);
        }
        while(t-->0){
            solution(obj,map);
        }

    }

    static class Pair implements Comparable<Pair>{

        char ch;
        int idx;

        public Pair(char ch,int idx){
            this.ch = ch;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair obj) {
            return (this.ch == obj.ch)?(this.idx-obj.idx):(this.ch-obj.ch);
        }
    }

    public static void solution(Scanner obj,HashMap<Character,Integer> map){

        String s = obj.next();
        StringBuilder str = new StringBuilder(s);
        long p = obj.nextLong();

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int i = 0; i <str.length(); i++) {
            char ch = str.charAt(i);
            pq.add(new Pair(ch,i));
        }

        long sum = 0;
        int i = 0;
        List<Integer> list = new ArrayList<>();
        while(!pq.isEmpty()){

            Pair rem = pq.remove();
//            System.out.println(rem.ch+" "+rem.idx);
            int temp = map.get(rem.ch);
            if((sum+temp)>p){
                break;
            }
            sum += temp;
            list.add(rem.idx);
            i++;
        }

        if(i == 0){
            System.out.println("");
        }
        else if(i == str.length()){
            System.out.println(s);
        }
        else{
            StringBuilder ans = new StringBuilder();
            Collections.sort(list);
            for (int j = 0; j < list.size(); j++) {
                ans.append(str.charAt(list.get(j)));
            }
            System.out.println(ans.toString());
        }




    }

}
