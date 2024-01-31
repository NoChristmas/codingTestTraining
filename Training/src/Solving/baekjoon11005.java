package Solving;

import java.util.*;
import java.io.*;

public class baekjoon11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = Integer.toString(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
        System.out.println(str.toUpperCase());
    }
}
