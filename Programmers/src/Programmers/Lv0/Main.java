package Programmers.Lv0;
import java.util.HashMap;
import java.util.Map;
public class Main {

	public static void main(String[] args) {
		int array[] = {1, 2, 3, 3, 3, 4};
		Map<Integer,Integer> map = new HashMap<>();
		
		int MaxCnt = 0;
		int answer = 0;
		
		for(int number : array) {
			//array[0]값 1을 찾고 1이 없으면 0이므로 결과 0;;; 2(X) 1
			int cnt = map.getOrDefault(number, 0) +1;
			if(cnt>MaxCnt) {
				MaxCnt = cnt;  //1;;
				answer = number; //1
			} else if (cnt == MaxCnt) answer = -1; //-1
			//1,1
			map.put(number,cnt);
		}
	
		for(int i : array) System.out.println(answer);
	
	
	
	//!!!!!!!!!HashMap 사용법 활용!!!!!!!!!!!!!//
	
	
	
	
	
	
	
	
	
	}

}

