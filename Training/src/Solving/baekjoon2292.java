package Solving;

import java.io.*;

public class baekjoon2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        
        int cnt = 1;
        int temp = 2;
        
        if(A == 1) {
            System.out.println(1);
            return;
        }
        
        while(temp <= A) {
            temp += (6*cnt);
            cnt++;
        }
        System.out.println(cnt);
    }
}
