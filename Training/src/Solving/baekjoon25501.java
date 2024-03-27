package Solving;

import java.util.*;
import java.io.*;

public class baekjoon25501 {
        static int res = 0;
        public static int recursion(String s, int l, int r, int cnt){
            if(l >= r) {
                res = cnt;
                return 1;
            }
            else if(s.charAt(l) != s.charAt(r)) {
                res = cnt;
                return 0;
            }
            else return recursion(s, l+1, r-1, cnt +=1);
        }
            
        public static int isPalindrome(String s){
            return recursion(s, 0, s.length()-1,1);
        }
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            for(int i = 0; i<N; i++) {
                String str = br.readLine();
                res = 0;
                System.out.println(isPalindrome(str)+" "+res);
            }
            
        }
}
