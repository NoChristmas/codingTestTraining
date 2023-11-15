package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class number10798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// br.readLine();

		// StringTokenizer st = new StringTokenizer(br.readLine());
		// st.nextToken();
		ArrayList<String> list = new ArrayList<>();
		String[][] strarr = new String[5][15];
		String result = "";


		for (int i = 0; i < 5; i++) {
			String str = br.readLine();
			for (int j = 0; j <15; j++) {
				if(j>=str.length()){
					strarr[i][j] = "#";
				} else{
					strarr[i][j] = String.valueOf(str.charAt(j));
				}
			}
		}

		for (int j = 0; j < 15; j++) {
			for (int i = 0; i < 5; i++) {
				if(strarr[i][j].equals("#"))
					continue;
				else {
					result += strarr[i][j];
				}
			}
		}

		System.out.println(result);

	}
}
