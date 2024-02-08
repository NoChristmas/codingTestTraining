package Solving;

import java.util.*;
import java.io.*;

public class baekjoon4779 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;
        String temp;
        while((temp = br.readLine()) != null) {
            sb = new StringBuilder();
            int N = Integer.parseInt(temp);
            int size = (int) Math.pow(3,N);
            String[] arr = new String[size];
            for(int i = 0; i<size; i++) {
                arr[i] = "-";
            }
            cantore(0,size,arr);
            for(String str : arr) {
                sb.append(str);
            }
            System.out.println(sb);
        }
        
    }

    static void cantore(int x, int size, String[] arr) {
        if(size == 1) {
            return;
        }
        size /= 3;
        for(int i = x+size; i<x+size+size; i++) {
            arr[i] = " ";
        }
        cantore(x,size,arr);
        cantore(x+size+size,size,arr);
    }
}
