package Solving;

import java.util.*;
import java.io.*;

public class baekjoon1969 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        
        String[] strArr = new String[T];
        
        for(int i = 0; i<T; i++) {
            strArr[i] = br.readLine();
        }
        
        int sum = 0;
        String result = "";        
        for(int i = 0; i<L; i++) {
            int[] arr = new int[4];
            int max = 0;
            int maxIdx = 0;
            for(int j = 0; j<T; j++) {
                if(strArr[j].charAt(i) == 'A') {
                    arr[0]++;        
                } else if (strArr[j].charAt(i) == 'C') {
                    arr[1]++;
                } else if (strArr[j].charAt(i) == 'G') {
                    arr[2]++;
                } else {
                    arr[3]++;
                }
            }

            for(int j =0; j<4; j++) {
                if(arr[j] > max) {
                    max = arr[j];
                    maxIdx = j;
                }
            }
            
            if(maxIdx == 0) result +="A";
            else if(maxIdx == 1) result += "C";
            else if(maxIdx == 2) result += "G";
            else result += "T";
            for(int j =0; j<4; j++) {
                if(j != maxIdx) {
                    sum += arr[j];
                }
            }
            
            
        }
        System.out.println(result);
        System.out.println(sum);
    }
    
}
