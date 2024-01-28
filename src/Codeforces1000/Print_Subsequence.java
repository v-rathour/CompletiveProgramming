package Codeforces1000;

public class Print_Subsequence {

    public static void main(String[] args) {
        String str = "abc";
        Subsequence(str);
    }

    public static void Subsequence(String str){
        int n = str.length();
        for (int i = 0; i < 1<<n; i++) {
             Pattern(str,i);
        }
    }

    public static void Pattern(String str, int i ){
        int pos = 0;
        while(i>0){
            if((i&1) != 0){
                System.out.print(str.charAt(pos));
            }
            pos++;
            i>>=1;
        }
        System.out.println();
    }



}
