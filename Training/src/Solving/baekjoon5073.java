package Solving;

import java.util.*;
import java.io.*;

public class baekjoon5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            if(A == 0 && B == 0 && C == 0) {
                return;
            }
            int[] arr = new int[3];
            arr[0] = A;
            arr[1] = B;
            arr[2] = C;

            int max = Math.max(A,Math.max(B,C));
            int maxIdx = 0;
            for(int i = 0; i<3; i++) {
                if(arr[i] == max) {
                    maxIdx = i;
                    continue;
                }
            }

            int temp = 0;
            for(int i = 0; i<3; i++) {
                if(i == maxIdx) {
                    continue;
                }
                temp += arr[i];
            }

            if(temp <= max) {
                System.out.println("Invalid");
                continue;
            }

            if(A == B && B == C) {
                System.out.println("Equilateral");
                continue;
            }
            if(A == B || A==C || B==C) {
                System.out.println("Isosceles");
                continue;
            }
            System.out.println("Scalene");
            
        }
    }
}
