package Programmers.Lv1;

import java.util.HashMap;

public class MemorialScore {
    public static void main(String args[]) {
        String[] name = { "may", "kein", "kain", "radi" };
        int[] yearning = { 5, 10, 1, 3 };
        String[][] photo = { { "may" }, { "kein", "deny", "may" }, { "kon", "coni" } };

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);

        }
        int[] result = new int[photo.length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                result[i] += map.getOrDefault(photo[i][j], 0);

            }

        }
        for (int i : result)
            System.out.println(i);

    }
}
