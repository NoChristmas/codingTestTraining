package Programmers.Lv0;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
public class LengthOfLine {
	//푸는 중
	public static void main(String[] args) {
		int[][] lines = {{-1,5},{3,9},{1,10}};
		Map<Integer,Integer> map = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		int startnumber = lines[0][0];
		int[] result = new int[201];
		for(int i =0; i<lines.length; i++) {
			int arrlength = lines[i][1]- lines[i][0] +1;
			int[] temp = new int[arrlength];
			
			for(int j = 0; j<arrlength; j++) {
				int cnt = map.getOrDefault(startnumber, 0) + 1;
				
				map.put(startnumber, cnt);
				startnumber ++;
				
			}
			
			
		}
		
		System.out.println(map.get(0));
		
	}

}
