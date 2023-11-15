package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


import java.util.HashMap;

public class baekjoon1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String,Integer> map = new HashMap<>();

		String str = br.readLine();
		str = str.toUpperCase();
		
		for(String s : str.split("")){
			map.put(s,map.getOrDefault(s,0)+1);
		}
		boolean flag = true;
		int max = -1;
		String result = "";
		int cnt = 0;

		for(String key : map.keySet()){
			
			if(max<map.get(key)){
				flag = true;
				max = map.get(key);
				result = key;
			} else if (max == map.get(key)){
				flag = false;
				result="?";
				
			}			
		}

		if(flag) System.out.println(result);
		else System.out.println(result);
	}
}
