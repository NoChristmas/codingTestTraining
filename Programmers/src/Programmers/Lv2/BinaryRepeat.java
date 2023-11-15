package Programmers.Lv2;

public class BinaryRepeat {
    public static void main(String[] args) {
        String s = "110010101001";
        int[] result = { 0, 0 };
        int num = 0;
        String temp = "";

        while (true) {

            result[0]++;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '0') {
                    result[1]++;
                } else if (c == '1') {
                    temp += String.valueOf(c);
                }

            }
            if (temp.equals("1"))
                break;
            num = temp.length();
            s = Integer.toBinaryString(num);
            temp = "";
        }
        System.out.println(result[0] + " " + result[1]);
    }
}
