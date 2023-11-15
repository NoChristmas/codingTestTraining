package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class number1193 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// br.readLine();
		// StringTokenizer st = new StringTokenizer(br.readLine());
		// st.nextToken();
		int N = Integer.parseInt(br.readLine());

		int curX = 0;
		int curY = 2;
		int i = 1;
		boolean flag = true; 
		while (i <= N) {
			
			curX++;
			curY--;

			
			if (curY == 0) {
				curY = curX;
				curX = 1;
			}
			
			if((curX+curY)%2 == 0) flag = false;
			else {flag = true;}
			i++;
		}
		if(flag) System.out.print(curX + "/" + curY);
		else System.out.print(curY +"/"+ curX);
	}
}
