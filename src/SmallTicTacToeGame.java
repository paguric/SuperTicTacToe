import javax.swing.*;
import java.awt.*;

public class SmallTicTacToeGame extends TicTacToeGame {
    public SmallTicTacToeGame(int row, int col) {
        super(row, col);
        setPreferredSize(new Dimension(GameFrame.WIDTH / 3, GameFrame.HEIGHT / 3 ));

        for (int i = 0; i < 9; i++) {
            super.add(new Cell(i / 3, i % 3));
        }

        setVisible(true);
    }

    public boolean checkBox(Point p) {
        if (super.getComponentAt(p).getClass() != Cell.class || !((Cell) super.getComponentAt(p)).isEmpty()) {
            return false;
        }
        Cell cell = (Cell) super.getComponentAt(p);
        if (GamePanel.getInstance().getFirstPlayerTurn()) {
            cell.setX();
        } else {
            cell.setO();
        }
        return true;
    }

}
