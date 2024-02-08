package Solving;

import java.util.*;
import java.io.*;

public class baekjoon1780 {
    static int[][] arr;
    static int[] color;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        color = new int[3];
        StringTokenizer st;
        for(int i = 0 ; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        paper(0,0,N);

        for(int i : color) {
            System.out.println(i);
        }
    }

    public static void paper(int y, int x, int size) {
        if(isItSame(y,x,size)) {
            int value = arr[y][x];
            if(value == -1) {
                color[0] += 1;
            } else if (value == 0) {
                color[1] += 1;
            } else {
                color[2] += 1;
            }
            return;
        }

        size /=3;
        for(int i = 0; i<3; i++) {
            for(int j = 0; j<3; j++) {
                paper(y+size*i,x+size*j,size);
            }
        }
    }

    public static boolean isItSame(int y, int x, int size) {
        int value = arr[y][x];
        for(int i = y; i < y+size; i++) {
            for(int j = x; j < x+size; j++) {
                if(value != arr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
