import javax.swing.*;
import java.awt.*;

public class TicTacToeController {

    private TicTacToeModel model;
    private TicTacToeView view;

    public TicTacToeController(TicTacToeModel model, TicTacToeView view) {
        this.model = model;
        this.view = view;

        JButton[][] buttons = view.getButtons();
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                final int r = row;
                final int c = col;
                buttons[r][c].addActionListener(e -> handleButtonClick(r, c));
            }
        }
    }

    private void handleButtonClick(int row, int col) {
        if (model.makeMove(row, col)) {
            char player = model.getCurrentPlayer();
            view.setButtonLabel(row, col, player);
            view.disableButton(row, col);

            char winner = model.checkWinner();
            if (winner != '-') {
                view.hideTopLabel();
                view.setBottomLabel(winner + " wins!");
                view.getBottomLabel().setForeground(Color.GREEN);
            } else if (model.isBoardFull()) {
                view.hideTopLabel();
                view.setBottomLabel("Tie!");
                view.getBottomLabel().setForeground(Color.ORANGE);
            } else {
                model.switchPlayer();
                char nextPlayer = model.getCurrentPlayer();
                view.setTopLabel("Current player: " + nextPlayer);
            }
        }
    }


}
