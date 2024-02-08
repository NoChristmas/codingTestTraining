package Solving;

import java.util.*;
import java.io.*;

public class baekjoon1735 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] arr1 = new int[2];
        arr1[0] = Integer.parseInt(st.nextToken());
        arr1[1] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        
        int[] arr2 = new int[2];
        arr2[0] = Integer.parseInt(st.nextToken());
        arr2[1] = Integer.parseInt(st.nextToken());
        
        int gcd = GCD(arr1[1],arr2[1]);
        int parent = (arr1[1]*arr2[1]/gcd);
        arr1[0] *= (parent/arr1[1]);
        arr2[0] *= (parent/arr2[1]);
        int child = arr1[0]+arr2[0];
        int tmp = GCD(child,parent);
        
        System.out.println(child/tmp + " " + parent/tmp);
    }

    public static int GCD(int b, int a) {
        if(b == 0) return a;
        if(a>b) {
            int temp = b;
            b = a;
            a = temp;
        }
        return GCD(b%a, a);
    }
}
