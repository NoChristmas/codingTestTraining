package Solving;

public class DevideBalls {

	public static void main(String[] args) {
		int balls = 5;
		int share = 2;
		int answer = 0;
		double top =1;
		double middle = 1;
		double bottom = 1;
		
		for(int i = balls; i>0; i--) {
			top *= i;
		}
		for(int i = share; i>0; i--) {
			bottom *= i;
		}
		for(int i = balls-share; i>0; i--) {
			middle *= i;
		}
		
		answer = (int)(top/(middle*bottom));
		
		
		System.out.println(answer);
	}

}
