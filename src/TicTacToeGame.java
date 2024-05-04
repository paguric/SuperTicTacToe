import javax.swing.*;
import java.awt.*;

public abstract class TicTacToeGame extends JPanel  {

    private final int row;
    private final int col;

    public TicTacToeGame(int row, int col) {
        super(new GridLayout(3, 3, 2, 2));
        this.row = row;
        this.col = col;

        addMouseListener(ML.getInstance());

        setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {

        int GAP_BETWEEN_EDGES = 10;

        int width = getWidth();
        int height = getHeight();

        g.drawLine(width / 3, GAP_BETWEEN_EDGES, width / 3, height - GAP_BETWEEN_EDGES);
        g.drawLine(2 * width / 3, GAP_BETWEEN_EDGES, 2 * width / 3, height - GAP_BETWEEN_EDGES);
        g.drawLine(GAP_BETWEEN_EDGES, height / 3, width - GAP_BETWEEN_EDGES, height / 3);
        g.drawLine(GAP_BETWEEN_EDGES, 2 * height / 3, width - GAP_BETWEEN_EDGES, 2 * height / 3);

    }


    
}
