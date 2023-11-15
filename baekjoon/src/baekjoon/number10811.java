package baekjoon;

import java.util.Scanner;

public class number10811 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] arr = new int[in.nextInt()];
		int[] temp = new int[arr.length];
		int T = in.nextInt();

		for(int i = 1; i<=arr.length; i++) {
			arr[i-1] = i;
			temp[i-1] = i;
		}

		for(int i = 0; i<T; i++) {
			
			int a = in.nextInt();
			int b = in.nextInt();
			int k = b-1;
			
			for(int j =a-1; j<=b-1; j++) {
				arr[j] = temp[k];
				k--;
				
			}
			
			for(int j =0; j<arr.length; j++) {temp[j] = arr[j];
			
			}
		}
			
		for (int i =0; i<arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
	}
}



