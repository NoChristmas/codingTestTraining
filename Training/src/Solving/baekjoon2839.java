package Solving;

import java.util.*;
import java.io.*;

public class baekjoon2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        //3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
        //1 0 1 2 0 2 3  2  3  4  3  4  3  4  5  4  5  4

        int[] arr = new int[N+1];
        if(N == 4 || N ==7) {
            System.out.println(-1);
            return;
        }
        int result = 0;
        int temp = N%5; 
        result += N/5;
        if(temp ==1 || temp==3) {
            result += 1;
        } else if(temp == 2 || temp == 4) {
            result += 2;
        }
        System.out.println(result);
    }
}
