package Programmers.Lv1;

public class SumNumberDivision {

	public static void main(String[] args) {
		int answer = 0;
		int left = 13;
		int right = 17;
		int length = Math.abs(left-right);
		int[] except = new int[(int)Math.sqrt(right)];
		
		for(int i = 1; i<=Math.sqrt(right); i++) {
			except[i-1] = (int) Math.pow(i, 2);
		}
		;
		for(int i=0; i<length+1; i++) {
			answer += left;
			for(int j = 1; j<=Math.sqrt(right); j++) {
				if(left == except[j-1]) answer -= 2*left;
			}
			left++;
			
		}
		System.out.println(answer);

	}

}
