import javax.swing.*;
import java.awt.*;

public abstract class TicTacToeGame extends JPanel implements TicTacToeGrid {

    private final int row;
    private final int col;

    public TicTacToeGame(int row, int col) {
        super(new GridLayout(3, 3));
        this.row = row;
        this.col = col;

        addMouseListener(ML.getInstance());

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
