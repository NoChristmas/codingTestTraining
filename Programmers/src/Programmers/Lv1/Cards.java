package Programmers.Lv1;

public class Cards {
    public static void main(String[] args) {
        String[] cards1 = { "i", "want", "to" };
        String[] cards2 = { "drink", "water", "aa", "bb", "cc" };
        String[] goal = { "i", "want", "to", "drink", "water" };

        String result = "Yes";

        int j = 0;
        int k = 0;
        for (int i = 0; i < goal.length; i++) {
            if (cards1.length > j && goal[i].equals(cards1[j])) {
                j++;
            } else if (cards2.length > k && goal[i].equals(cards2[k])) {
                k++;
            } else {
                result = "No";
                break;
            }

        }

        System.out.println(result);

    }
}
