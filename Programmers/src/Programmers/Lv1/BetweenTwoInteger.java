package Programmers.Lv1;

public class BetweenTwoInteger {

	public static void main(String[] args) {
		long answer = 0;
		int a =5;
		int b =3;
		long temp = Math.abs(b-a);
		long[] arr = new long[(int)temp+1];
		
		
			for(int i = 0; i<arr.length; i++) {
				if(a>=b) arr[i] = i+b;
				else if(a<b) arr[i] = i+a;
				answer += arr[i];
			}
				
			System.out.println(answer);
	}

}
