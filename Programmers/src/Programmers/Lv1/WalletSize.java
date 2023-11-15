package Programmers.Lv1;
import java.util.Arrays;
public class WalletSize {
	public static void main(String[] args) {
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		
		for(int i =0; i<sizes.length; i++) {
			Arrays.sort(sizes[i]);
		}
		
		
		int h = sizes[0][0];
		int w = sizes[0][1];
		for(int i =1; i<sizes.length; i++) {
			if(sizes[i][0]> h) {
					h = sizes[i][0];
					
			}
		}
		for(int i =1; i<sizes.length; i++) {
			if(sizes[i][1]>w) {
					w = sizes[i][1];
			}
		}
		
		System.out.println(h*w);
	}

}
