package Solving;

import java.util.*;
import java.io.*;

public class baekjoon23971 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int dy = Integer.parseInt(st.nextToken());
        int dx = Integer.parseInt(st.nextToken());
       
        int row = (x-1)/(dx+1);
        int column = (y-1)/(dy+1);
        
        int result = (row+1)*(column+1);

        System.out.println(result);
    }    
}
