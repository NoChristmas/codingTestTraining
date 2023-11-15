package Programmers.Lv1;

public class Trio {
	public static void main(String[] args) {
		int[] number = {-1,1,-1,1};
		int cnt =0;
		
		for(int i =0; i<number.length; i++) {
			for (int j = i+1; j<number.length; j++) {
				for (int k = j+1; k<number.length; k++) {
					if(number[i] + number[j] + number[k]==0) cnt ++;
				}
			}
		}
		System.out.println(cnt);
	}

}
