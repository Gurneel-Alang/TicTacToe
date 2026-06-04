import javax.swing.*;
import java.awt.*;

public class TicTacToeView {

    // Instance variables
    private JFrame frame;
    private JLabel topLabel;
    private JLabel bottomLabel;
    private JButton[][] buttons;

    // Constructor (actual GUI)
    public TicTacToeView() {
        topLabel = new JLabel("Current player: X");
        bottomLabel = new JLabel("");

        buttons = new JButton[3][3];

        JPanel gridPanel = new JPanel(new GridLayout(3, 3, 10, 10));
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                buttons[row][col] = new JButton();
                gridPanel.add(buttons[row][col]);
            }
        }

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(topLabel, BorderLayout.NORTH);
        mainPanel.add(gridPanel, BorderLayout.CENTER);
        mainPanel.add(bottomLabel, BorderLayout.SOUTH);

        frame = new JFrame("Tic Tac Toe");
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    // Getters
    public JFrame getFrame() { return frame; }

    public JLabel getTopLabel() { return topLabel; }

    public JLabel getBottomLabel() { return bottomLabel; }

    public JButton[][] getButtons() { return buttons; }

    //
    public void setTopLabel(String text) { topLabel.setText(text); }

    public void hideTopLabel() { topLabel.setVisible(false); }

    public void setBottomLabel(String text) { bottomLabel.setText(text); }

    public void setButtonLabel(int row, int col, char c) { buttons[row][col].setText(String.valueOf(c)); }

    public void disableButton(int row, int col) { buttons[row][col].setEnabled(false); }
}
