package Solving;

import java.util.*;
import java.io.*;


public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = br.read();
        int[] arr = new int[N];
        
        for(int i =1; i < N; i++) {
            arr[i] = 1;
            int parent = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());
            
        }
    }
}
