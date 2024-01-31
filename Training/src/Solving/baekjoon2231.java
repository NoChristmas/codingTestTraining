package Solving;

import java.util.*;
import java.io.*;

public class baekjoon2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int temp = 0;
        for(int i = 0; i<=N; i++) {
            temp = 0;
            String str = String.valueOf(i);
            for(String strTemp : str.split("")) {
                temp += Integer.parseInt(strTemp);
            }
            temp += i;
            if(temp == N) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
