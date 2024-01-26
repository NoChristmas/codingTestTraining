package Solving;

import java.util.*;
import java.io.*;

public class baekjoon1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i<T; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0) {
                System.out.println(1 + " " + 0);
                continue;
            }
            if(num == 1) {
                System.out.println(0+" "+1);
                continue;
            }
            int[] zero = new int[num+1];
            zero[0] = 1;
            zero[1] = 0;
            for(int j = 2; j<num+1; j++) {
                zero[j] = zero[j-1] + zero[j-2];
            }

            int[] one = new int[num+1];
            one[0] = 0;
            one[1] = 1;
            for(int j =2; j<num+1; j++) {
                one[j] = one[j-1]+one[j-2];
            }
            System.out.println(zero[num] + " " + one[num]);
        }
    }
}
