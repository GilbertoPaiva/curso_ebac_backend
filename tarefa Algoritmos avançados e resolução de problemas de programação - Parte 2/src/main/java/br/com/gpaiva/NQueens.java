package br.com.gpaiva;

public class NQueens {
    private static int N = 8;
    private static int[] board = new int[N];

    public static void main(String[] args) {
        solve(0);
    }

    private static boolean solve(int row) {
        if (row == N) {
            printSolution();
            return true;
        }
        for (int col = 0; col < N; col++) {
            if (isSafe(row, col)) {
                board[row] = col;
                if (solve(row + 1)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isSafe(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i] == col || Math.abs(board[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }

    private static void printSolution() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
