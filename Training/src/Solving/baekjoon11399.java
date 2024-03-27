package Solving;
import java.util.*;
import java.io.*;
public class baekjoon11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        int j = 0;
        for(int i = arr.length-1; i>=0; i--) {
            sum += arr[j]*i;
            j++;
        }
        System.out.println(sum);
    }
}
