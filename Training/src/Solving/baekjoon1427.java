package Solving;

import java.util.*;
import java.io.*;

public class baekjoon1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        int[] arr = new int[str.length()];
        int j = 0;
        for(String temp : str.split("")) {
            arr[j] = Integer.parseInt(temp);
            j++;
        }
        Arrays.sort(arr);
        for(int i = 0; i<arr.length; i++) {
            sb.append(arr[i]);
        }
        sb.reverse();
        System.out.println(sb);
    }
}
