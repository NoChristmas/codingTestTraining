package Solving;

import java.util.*;
import java.io.*;

public class baekjoon1347 {
    static String[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] temp = br.readLine().split("");
        
        arr = new String[101][101];
        for(int i = 0; i<101; i++) {
            for(int j =0; j<101; j++) {
                arr[i][j] = "#";
            }
        }
        int curX = 50;
        int curY = 50;
        int cnt = 0;
        arr[50][50] = ".";
        for(String str : temp) {
            switch(str) {
                case("R") : { //4번
                    cnt = (cnt+1)%4; //%4 3, 7 번 돌면 같음
                    break;
                }
                case("L") : { //4번
                    cnt = (cnt-1)%4; //%4 1번 5번 
                    break;
                }
                case("F") : {
                    if(cnt == 1 || cnt == -3) { //x좌표 -1
                        curX -= 1;
                        arr[curY][curX] = ".";
                    } else if (cnt == 2 || cnt == -2) { //y좌표 -1
                        curY -= 1;
                        arr[curY][curX] = ".";
                    } else if (cnt == 3 || cnt == -1) { //x좌표 +1
                        curX += 1;
                        arr[curY][curX] = ".";
                    } else { //cnt == 0 y좌표 +1
                        curY += 1;
                        arr[curY][curX] = ".";
                    }
                    break;
                }
            }
        }
        int maxY = 0;
        int minY = 101;
        int maxX = 0;
        int minX = 101;
        for(int i = 0; i<=100; i++) {
            for(int j = 0; j<=100; j++) {
                if(arr[i][j].equals(".")) {
                    maxY = Math.max(maxY,i);
                    minY = Math.min(minY,i);
                    maxX = Math.max(maxX,j);
                    minX = Math.min(minX,j);
                }
            }
            
        }
        for(int i = minY; i<=maxY; i++) {
            for(int j = minX; j<=maxX; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        
    }    
}
