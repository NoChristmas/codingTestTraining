package Solving;

public class babbling {
    public static void main(String[] args) {
        String[] babbling = { "ayaye", "uuu", "yeye", "yemawoo", "ayaayaa" };

        String[] joka = { "aya", "ye", "woo", "ma" }; // 반복을 허용하지 않음
        int result = 0;

        for (int i = 0; i < babbling.length; i++) {
            
            for (int j = 0; j < joka.length; j++) {
                babbling[i] = babbling[i].replaceFirst(joka[j], " ");
            }
            babbling[i] = babbling[i].replaceAll(" ","");
            if (babbling[i].length() == 0)
                result++;
        }
        System.out.println(result);
    }
}
