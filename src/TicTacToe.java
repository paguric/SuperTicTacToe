import javax.swing.*;
import java.awt.*;

public class TicTacToe extends JPanel implements TicTacToeGrid {

    private final int row;
    private final int col;

    public TicTacToe(int row, int col) {
        super();
        this.row = row;
        this.col = col;
        setSize(new Dimension(GameFrame.WIDTH / 3, GameFrame.HEIGHT / 3));

        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        paintGrid(g);
    }

    @Override
    public int getRow() {
        return row;
    }

    @Override
    public int getCol() {
        return col;
    }
}
