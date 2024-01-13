package Codeforces1000;


import java.util.Scanner;

public class Mocha_Red_Blue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            solve(scanner);
        }
    }

    public static void solve(Scanner obj) {
        int n = obj.nextInt();
        String s = obj.next();

        if (s.indexOf('B') == -1 && s.indexOf('R') == -1) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < n; i++) {
                result.append((i % 2 == 0) ? 'B' : 'R');
            }
            System.out.println(result);
        } else {
            char[] chars = s.toCharArray();
            for (int i = 0; i < n; i++) {
                if (chars[i] != '?') {
                    for (int j = i - 1; j >= 0 && chars[j] == '?'; j--) {
                        chars[j] = (chars[j + 1] == 'B') ? 'R' : 'B';
                    }
                    for (int j = i + 1; j < n && chars[j] == '?'; j++) {
                        chars[j] = (chars[j - 1] == 'B') ? 'R' : 'B';
                    }
                }
            }
            System.out.println(new String(chars));
        }
    }

    public static int read() {
        int x = 0, f = 0;
        char ch = readChar();
        while (ch < '0' || ch > '9') {
            f = (ch == '-') ? 1 : 0;
            ch = readChar();
        }
        while (ch >= '0' && ch <= '9') {
            x = x * 10 + ch - '0';
            ch = readChar();
        }
        return (f == 1) ? -x : x;
    }

    public static char readChar() {
        char ch = ' ';
        try {
            ch = (char) System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ch;
    }

    public static String readString() {
        StringBuilder str = new StringBuilder();
        char ch = readChar();
        while (ch != ' ' && ch != '\n') {
            str.append(ch);
            ch = readChar();
        }
        return str.toString();
    }
}