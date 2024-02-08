package Solving;

import java.util.*;
import java.io.*;

public class baekjoon11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int len = str.length();
        int i = 0;
        int j = 0;
        Set<String> set = new HashSet<>();
        while(true) {
            String temp = "";
            temp = str.substring(i,i+j);
            set.add(temp);
            j++;
            if(i+j > len || j > len) {
                i++;
                j = 1;
            }
            if(i == len) {
                break;
            }
        }
        System.out.println(set.size()-1);
    } 
}
