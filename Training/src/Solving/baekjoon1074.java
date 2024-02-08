package Solving;

import java.util.*;
import java.io.*;

public class baekjoon1074 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        System.out.println(findZ(r,c,N,0));
    }

    public static int findZ(int y, int x, int size, int num) {
        if(size == 0) {
            return num;
        }
        size--;
        int row = (int) Math.pow(2,size);
        int col = (int) Math.pow(2,size);
        //size = 3 일 때 y = 0~7, x = 0~7
        if(y < col && x < row) { //왼위
            return findZ(y,x,size,num);
        } else if (y < col && x >= row) { //오른 위
            return findZ(y,x - row,size, num += (int)Math.pow(4,size)*1);
        } else if (y >= col && x < row) {
            return findZ(y - col, x, size, num += (int)Math.pow(4,size)*2);
        } else {
            return findZ(y - col, x - row, size, num += (int)Math.pow(4,size)*3);
        }

        
    }
}
