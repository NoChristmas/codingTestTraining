package baekjoon;
import java.util.Scanner;
public class number10813 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[in.nextInt()];
		int T = in.nextInt();
		for(int i = 0; i<arr.length; i++) arr[i] = i+1;
		for(int i = 0; i<T; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int temp = 0;
			
			temp = arr[a-1];
			arr[a-1] = arr[b-1];
			arr[b-1] = temp;
			
		}
		for(int i : arr) System.out.print(i+" ");
	}

}
