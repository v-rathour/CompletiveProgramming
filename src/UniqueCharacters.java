import java.util.HashSet;
import java.util.Scanner;

public class UniqueCharacters {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String []arr = {"cha","r","act","ers"};
        System.out.println(Subsequence(arr,0,0,new HashSet<>()));
    }

    public static int Subsequence(String []arr,int i, int n, HashSet<Character> set){
        if(arr.length == i){
            return n;
        }

        HashSet<Character> charc = new HashSet<>();
        int count = 0;
        for (int j = 0; j < arr[i].length(); j++) {
            char ch = arr[i].charAt(j);
            if(!set.contains(ch) && !charc.contains(ch)){
                count++;
            }
            charc.add(ch);
        }


        int a = 0;
        if(count == arr[i].length()){

            set.addAll(charc);
            a = Subsequence(arr,i+1,n+arr[i].length(),set);
            set.removeAll(charc);
        }
        int b = Subsequence(arr,i+1,n,set);


        return Math.max(a,b);
    }

}
