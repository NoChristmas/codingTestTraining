package Solving;

import java.util.*;
import java.io.*;

public class baekjoon1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            LinkedList<int[]> q = new LinkedList<>();
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            
            for(int j = 0; j<A; j++) {
                int num = Integer.parseInt(st.nextToken());
                q.add(new int[]{j, num});
            }
            
            
        }
    }
}
