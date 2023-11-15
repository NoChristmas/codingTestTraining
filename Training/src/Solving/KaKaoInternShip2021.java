package Solving;


public class KaKaoInternShip2021 {

	public static void main(String[] args) {
		//메모리 버퍼에 대한 공부가 필요....
		
		String s = "23four5six7";
		
		String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		for(int i =0; i<10; i++) {
			s= s.replace(num[i],Integer.toString(i));
		}
		
		int result = Integer.parseInt(s);
		System.out.println(result);
		
		
	}
	
}
