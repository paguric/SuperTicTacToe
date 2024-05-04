import javax.swing.*;
import java.awt.*;

public class SmallTicTacToeGame extends TicTacToeGame {

    public SmallTicTacToeGame(int row, int col) {
        super(row, col);
        setPreferredSize(new Dimension(GameFrame.WIDTH / 3, GameFrame.HEIGHT / 3));

        for (int i = 0; i < 9; i++) {
            super.add(new JPanel());
        }
    }

}
