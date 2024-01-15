package Solving;

import java.util.*;
import java.io.*;

public class Notion021 {
    static int N,r,c,result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = (int) Math.pow(2,Integer.parseInt(st.nextToken()));
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        result = 0;
        zSolution(N,r,c);
        System.out.println(result);
    }
    //0,0 / 0,1 / 1,0 / 1,1 왼쪽 위
    //0,2 / 0,3 / 1,2 / 1,3 오른쪽 위
    //2,0 / 2,1 / 3,0 / 3,1 왼쪽 아래
    //2,2 / 2,3 / 3,2 / 3,3 오른쪽 아래

    //size는 한변의 길이
    public static void zSolution(int size, int Y, int X) {
        if(size == 1) return;
        
        //왼쪽위
        if(Y < size/2 && X < size/2)  {
            zSolution(size/2, Y, X);
        //오른쪽 위
        } else if(Y < size/2 && X >= size/2) {
            result += size * size / 4;
            zSolution(size/2, Y, X-size/2);
        //왼쪽 아래
        } else if(Y >= size/2 && X < size/2) {
            result += (size * size / 4) * 2;
            zSolution(size/2, Y-size/2, X);
        //오른쪽 아래
        } else {
            result += (size * size / 4) * 3;
            zSolution(size/2, Y-size/2, X-size/2);
        }

    }
}
