package Solving;

import java.util.*;
import java.io.*;

public class baekjoon2447 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][N];
        for(int i = 0; i<N; i++) {
            for(int j = 0; j<N; j++) {
                arr[i][j] = "*";
            }
        }
        star(0,0,N,arr);
        
        for(int i = 0; i<N; i++) {
            for(int j = 0; j<N; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void star(int y,int x,int size,String[][] arr) {
        if(size == 1) {
            return;
        }
        size /= 3; //9
        for(int i = y+size; i<y+size*2; i++) {
            for(int j = x+size; j<x+size*2; j++) {
                arr[i][j] = " ";
            }
        }
        
        for(int i = 0; i<3; i++) {
            for(int j = 0; j<3; j++) {
                star(y + size*i, x + size*j, size, arr);
            }
        }
    }
}
