package Programmers.Lv1;

public class PlusMinusSUM {

	public static void main(String[] args) {
		int[] absolute = {1,2,3};
		boolean[] signs = {false,false,true};
		int answer = 0;
				
		for(int i =0; i<signs.length; i++) {
			if(signs[i] == true) {
				answer += absolute[i];
			} else if(signs[i] == false) {
				answer -= absolute[i];
			}
			
		}
		System.out.println(answer);

	}

}
