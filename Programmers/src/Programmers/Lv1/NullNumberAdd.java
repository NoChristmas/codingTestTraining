package Programmers.Lv1;
import java.util.Map;
import java.util.HashMap;

public class NullNumberAdd {

	public static void main(String[] args) {
		Map<Integer,Integer> map = new HashMap<>();
		int result = 0;
		int[] numbers = {1,2,3,4,6,7,8,0};
		
		for(int i =0; i<10; i++) map.put(i,i);
		
		for(int i = 0; i<numbers.length; i++) {
			if(map.containsValue(numbers[i])) map.replace(numbers[i],0); 
			}
		
		for(int i=0; i<10; i++) result += map.getOrDefault(i,0);
		System.out.println(result);
	}
		
}
