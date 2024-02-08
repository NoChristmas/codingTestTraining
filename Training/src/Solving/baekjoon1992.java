package Solving;

import java.util.*;
import java.io.*;

public class baekjoon1992 {
    static int[][] img;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        img = new int[N][N];
        for(int i = 0; i<N; i++) {
            String tmp = br.readLine();
            for(int j = 0; j<tmp.length(); j++) {
                img[i][j] = tmp.charAt(j)-'0';
            }
        }
        zipper(0,0,N);

        System.out.println(sb);
    }
    
    public static void zipper(int y, int x, int size) {

        if(isPossible(y,x,size)) {
            sb.append(img[y][x]);
            return;
        }

        size /= 2;

        sb.append("(");
        zipper(y,x,size);
        zipper(y,x+size,size);
        zipper(y+size,x,size);
        zipper(y+size,x+size,size);
        sb.append(")");

    }

    public static boolean isPossible(int y, int x, int size) {
        int value = img[y][x];

        for(int i = y; i < y+size; i++) {
            for(int j = x; j<x+size; j++) {
                if(value != img[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
