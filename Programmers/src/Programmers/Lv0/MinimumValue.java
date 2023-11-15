package Programmers.Lv0;
import java.util.Arrays;
public class MinimumValue {
	public static int solution(int[] array) {
        Arrays.sort(array);

        int answer = 0;
        int max = 0;
        int maxNum = array[0];
        int cnt = 1;

        for (int i = 1; i < array.length; i++) {
            if(array[i] == array[i-1]) {
                cnt++;
                if(cnt > max) {
                    max = cnt;
                    maxNum = array[i];
                }
                else if(cnt == max) {
                    maxNum = -1;
                }
            }
            else{
                cnt = 1;
            }
        }
        
        answer = maxNum;
        
        return answer;
    }
	public static void main(String[] args) {
		int[] array = {5,2,7,20,5};
				
		System.out.println(solution(array));
	}

}
