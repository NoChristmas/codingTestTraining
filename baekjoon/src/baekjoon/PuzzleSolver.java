package baekjoon;

public class PuzzleSolver {

    static int[][][] pieces = {
            {{1}},
            {{1, 1}, {1, 1}},
            {{1, 1, 1, 1}, {1, 1, 1, 1}},
            {{1, 1, 0, 0}, {1, 1, 0, 0}, {1, 1, 0, 0}, {1, 1, 0, 0}}
    };

    public static int countPuzzleSolutions(int n, int m) {
        // dp 배열 초기화
        int[][] dp = new int[n + 1][m + 1];
        dp[0][0] = 1; // 초기값 설정

        // 퍼즐 조각을 하나씩 가져와서 dp 배열 갱신
        for (int[][] piece : pieces) {
            int rows = piece.length;
            int cols = piece[0].length;

            for (int i = 0; i <= n - rows; i++) {
                for (int j = 0; j <= m - cols; j++) {
                    // 현재 위치에서 해당 조각을 놓을 수 있는지 확인
                    boolean canPlace = true;
                    for (int k = 0; k < rows; k++) {
                        for (int l = 0; l < cols; l++) {
                            if (piece[k][l] == 1 && dp[i + k][j + l] != 0) {
                                canPlace = false;
                                break;
                            }
                        }
                        if (!canPlace) break;
                    }

                    // 해당 위치에 조각을 놓을 수 있다면 dp 배열 갱신
                    if (canPlace) {
                        for (int k = 0; k < rows; k++) {
                            for (int l = 0; l < cols; l++) {
                                if (piece[k][l] == 1) {
                                    dp[i + k][j + l] = 1;
                                }
                            }
                        }
                    }
                }
            }
        }

        // dp 배열을 순회하면서 가능한 경우의 수 계산
        int count = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (dp[i][j] == 0) count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int n1 = 2;
        int m1 = 4;
        System.out.println("가로 " + n1 + ", 세로 " + m1 + "인 퍼즐을 맞출 수 있는 경우의 수는 " + countPuzzleSolutions(n1, m1) + "개입니다.");

        int n2 = 4;
        int m2 = 2;
        System.out.println("가로 " + n2 + ", 세로 " + m2 + "인 퍼즐을 맞출 수 있는 경우의 수는 " + countPuzzleSolutions(n2, m2) + "개입니다.");
    }
}
