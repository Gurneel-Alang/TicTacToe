public class TicTacToeModel {

    // Instance variables
    private final char[][] board;
    private char currentPlayer;

    // Constructor (standard 3x3 Tic Tac Toe board)
    public TicTacToeModel() {
        board = new char[3][3];
        currentPlayer = 'X';
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = '-';
            }
        }
    }

    // Getters
    public char[][] getBoard() { return board; }

    public char getCurrentPlayer() { return currentPlayer; }

    // Game logic
    public void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else if (currentPlayer == 'O') {
            currentPlayer = 'X';
        }
    }

    public boolean makeMove(int row, int col) {
        if (0 <= row && row < 3 && 0 <= col && col < 3 && board[row][col] == '-') {
            board[row][col] = currentPlayer;
            return true;
        }
        return false;
    }

    public char checkWinner() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
                return board[i][0];
            }

            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != '-') {
                return board[0][i];
            }
        }

        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
            return board[0][0];
        }

        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != '-') {
            return board[0][2];
        }

        return '-';
    }

    public boolean isBoardFull() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}
