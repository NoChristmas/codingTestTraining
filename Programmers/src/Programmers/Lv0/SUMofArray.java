package Programmers.Lv0;

public class SUMofArray {

	public static void main(String[] args) {
		int num = 3;
		int total = 12;
		
		int[] answer = new int[num];
        
        int nSum = num * (1 + num) / 2;
        int start = (total - nSum) / num;

        for(int i=1; i<num+1; i++){
                answer[i - 1] = i + start;
        }
        
        
	}

}
