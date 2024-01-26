package Solving;

import java.util.*;
import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] temp = br.readLine().split(" ");
        int max = 0;
        int min = Integer.MAX_VALUE;
        int[] arr = new int[T];
        for(int i = 0; i<temp.length; i++) {
            arr[i] = Integer.parseInt(temp[i]);
            max = Math.max(arr[i],max);
            min = Math.min(arr[i],min);
        }
        /*
        int num = arr[0];
        int i = 0;
        
        while(true) {
            if(i+1 == arr.length) break;
            num = Solution(arr[i],arr[i+1]);
            i++;
        }
        */
        System.out.println(min*max);
    }
    
    public static int Solution(int a, int b) {
        if(b == 0) return a;
        if(a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        return Solution(b, a%b);
    }
}