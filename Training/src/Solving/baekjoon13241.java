package Solving;

import java.util.*;
import java.io.*;

public class baekjoon13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long gcd = GCD(A,B);
        System.out.println(A*B/gcd);
    }
    //a = 5 b = 3
    //5%3 = 2 > 3%2 = 1 > 2%1  = 0
    //
    public static long GCD (long a, long b) {
        if(a==0) return b;
        if(b > a) {
            long temp = b;
            b = a;
            a = temp;
        }
        return GCD(a%b,b);
    }
}
