package Codeforces1000;

import java.util.HashMap;
import java.util.Scanner;

public class MusicalNotes {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        long t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        long n = obj.nextInt();
        HashMap<Long,Long> map = new HashMap<>();

        for (long i = 0; i < n; i++) {
            long num = obj.nextLong();
            if(!map.containsKey(num)){
                map.put(num,1L);
            }
            else{
                map.put(num,map.get(num)+1);
            }
        }

        long ans = 0;
        for(long num : map.keySet()){

            long temp = map.get(num);
            ans += (temp*(temp-1))/2;

        }

        if(map.containsKey(1L) && map.containsKey(2L)){
            ans += (map.get(1L)*map.get(2L));
        }

        System.out.println(ans);

    }

}
