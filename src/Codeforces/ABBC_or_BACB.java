package Codeforces;

import java.util.Scanner;
import java.util.Stack;

public class ABBC_or_BACB {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){
        String s = obj.next();

        Stack<Character> st = new Stack<>();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'A'){

                if(!st.isEmpty() && st.peek() == 'B'){
                   count++;
                   st.pop();
                   st.push('C');
                   st.push('B');
                }
                else{
                    st.push(ch);
                }
            }
            else{

                if(!st.isEmpty() && st.peek() == 'A'){
                    while(!st.isEmpty() && st.peek() == 'A'){
                        count++;
                        st.pop();

                    }
                    st.push('B');
                    st.push('C');
                }
                else{
                    st.push(ch);
                }

            }
        }

        System.out.println(count);
    }

}
