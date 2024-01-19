package Solving;

import java.util.*;
import java.io.*;

public class baekjoon1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;
        for(int i = 0; i<T; i++) {
            int number = Integer.parseInt(st.nextToken());
            boolean flag = false;
            if(number == 1) continue;
            if(number == 2) {
                cnt++;
                continue;
            }
            for(int j = 2; j<=Math.sqrt(number); j++) {
                if(number%j == 0) {
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                cnt++;
            }
        }
        System.out.println(cnt);    
        
    }
}
