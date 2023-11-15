package Programmers.Lv1;

public class Painting {
    public static void main(String[] args) {
        int n = 5;
        int m = 4;
        int[] section = { 1, 3 };

        boolean[] flags = new boolean[n + 1];
        int result = 0;

        for (int i = 0; i < n + 1; i++)
            flags[i] = true;
        for (int i = 0; i < section.length; i++)
            flags[section[i]] = false;

        for (int i = 1; i <= n; i++) {
            if (flags[i] == false) {
                result++;
                for (int j = i; j < i + m; j++) {
                    if (j > flags.length - 1)
                        break;
                    flags[j] = true;
                }

            }

        }

        System.out.println(result);

    }
}
