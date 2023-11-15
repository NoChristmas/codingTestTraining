package Programmers.Lv1;

import java.util.ArrayList;

public class KaKaoCrainGame {
    public static void main(String[] args) {

        int[][] board = { { 0, 0, 0, 0, 0 },
                { 0, 0, 1, 0, 3 },
                { 0, 2, 5, 0, 1 },
                { 4, 2, 4, 4, 2 },
                { 3, 5, 1, 3, 1 } };

        int moves[] = { 1, 5, 3, 5, 1, 2, 1, 4 };
        ArrayList<Integer> list = new ArrayList<>();

        int bucket[] = new int[moves.length];

        int result = 0;

        for (int i = 0; i < moves.length; i++) {

            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i] - 1] != 0) {
                    bucket[i] = board[j][moves[i] - 1];
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }

        }

        for (int i = 0; i < bucket.length; i++) {
            if (bucket[i] != 0)
                list.add(bucket[i]);
        }

        for (int i = 0; i < list.size() - 1; i++) {

            if (i + 1 >= list.size())
                break;

            if (list.get(i) == list.get(i + 1)) {
                result += 2;

                list.remove(i);
                list.remove(i);

                if (i > 0)
                    i -= 2;
                else if (i == 0)
                    i -= 1;
            }
        }
        
        System.out.println(result);

    }
}
