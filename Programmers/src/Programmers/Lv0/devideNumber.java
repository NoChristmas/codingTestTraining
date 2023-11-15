package Programmers.Lv0;

public class devideNumber {

	static int gcd(int a, int b) {
		if (b==0) return a;
		return gcd(b,a%b);
	}
	
	public static void main(String[] args) {
		int answer = 0;
		int a = 22; 
		int b = 11;
		b /= gcd(a,b);
		
		while(b!=1) { //나눌 경우 빠져나감
			if(b%2 ==0) { //2로 나눠질 경우 
				b /=2; //2로 나눔
			} else if (b%5 ==0) { //5로 나눠질 경우
				b /=5; //5로 나눔
			} else { //두가지 경우 (2나 5로 안나눠질 경우) 2로 반환
			  answer = 2;
			  break;
			}
			
		}
		answer = 1;		
		System.out.println(answer);
	}

}
