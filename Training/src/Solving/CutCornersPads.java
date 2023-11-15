package Solving;

import java.util.HashMap;

public class CutCornersPads {
    public static void main(String[] args) {
        String[] keymap = { "ABACD", "BCEFD" };
        String[] targets = { "ABCD", "AABB" };

        HashMap<Character, Integer> map = new HashMap<>();

        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char c = key.charAt(i);
                if (!map.containsKey(c) || map.get(c) >= i+1) {
                    map.put(c, i + 1);
                }
            }
        }

    }
}

/*
 * HashMap<Character, Integer> map = new HashMap<>();
 * int[] ret = new int[targets.length];
 * 
 * for (String key : keymap) {
 * for (int i = 0; i < key.length(); i++) { //keymap 안의 String 갯수를 반복문으로 집어 넣음
 * char c = key.charAt(i); //String의 index를 1씩 증가하며 하나씩 넣음
 * if (!map.containsKey(c) || i < map.get(c)) { //
 * map.put(c, i + 1); //각 알파벳 별로 최솟값을 넣는 작업...
 * }
 * }
 * }
 * 
 * //for(char key : map.keySet())
 * System.out.println("key :"+String.valueOf(key)+" / value : "+ map.get(key));
 * 
 * for (int i = 0; i < targets.length; i++) {
 * int cnt = 0;
 * for (int j = 0; j < targets[i].length(); j++) {
 * char c = targets[i].charAt(j);
 * if (!map.containsKey(c)) {
 * cnt = 0;
 * break;
 * } else {
 * cnt += map.get(c);
 * }
 * }
 * ret[i] = cnt == 0 ? -1 : cnt;
 * }
 * System.out.print(ret);
 */