package Programmers.Lv1;

public class CollatzGuess {

	public static void main(String[] args) {
		
		int answer = 0;
		int num = 123467;
		long t = num;
		int cnt = 0;
		
		if (t==1) answer = 0;
		while(true) {
			if(t%2==0) {
				t /=2;
				cnt ++;
			}
			else if(t%2!=0) {
				t = t*3+1;
				cnt ++;
			}
			
			if(cnt >500) {
				answer = -1;
				break;
			}
			if(t == 1) break;
				
		}
		System.out.println(cnt);
	}

}
