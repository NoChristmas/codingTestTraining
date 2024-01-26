package Solving;
import java.io.*;
public class baekjoon11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        //1 2 3 4 5 6 7 8 9 10
        //1 2 3 5 8 13213455
        int[] dp = new int[num+1];
        if(num == 0) {
            System.out.println(0);
            return;
        }
        if(num == 1) {
            System.out.println(1);
            return;
        }
        if(num == 2) {
            System.out.println(2);
            return;
        }
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for(int i =3; i<num+1; i++) {
            dp[i] = (dp[i-1]%10007)+(dp[i-2]%10007);
            dp[i] %= 10007;
        }

        System.out.println(dp[num]);
    }
}
