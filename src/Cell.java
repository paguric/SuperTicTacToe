import javax.swing.*;
import java.awt.*;

public class Cell extends JPanel {
    private static final int GAP_BETWEEN_EDGES = 10;
    private Mark mark;
    private int row;
    private int col;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        setVisible(true);
    }

    public void setX() {
        mark = Mark.X;
    }

    public void setO() {
        mark = Mark.O;
    }

    public boolean isEmpty() {
        return mark == null;
    }

    public boolean isX() {
        return mark == Mark.X;
    }

    public boolean isO() {
        return mark == Mark.O;
    }

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (isX()) {
            g.drawLine(GAP_BETWEEN_EDGES, GAP_BETWEEN_EDGES, getWidth() - GAP_BETWEEN_EDGES, getHeight() - GAP_BETWEEN_EDGES);  // main diagonal
            g.drawLine(GAP_BETWEEN_EDGES + 1, GAP_BETWEEN_EDGES, getWidth() + 1 - GAP_BETWEEN_EDGES, getHeight() - GAP_BETWEEN_EDGES);  // makes line wider

            g.drawLine(getWidth() - GAP_BETWEEN_EDGES, GAP_BETWEEN_EDGES, GAP_BETWEEN_EDGES, getHeight() - GAP_BETWEEN_EDGES);  // secondary diagonal
            g.drawLine(getWidth() + 1 - GAP_BETWEEN_EDGES, GAP_BETWEEN_EDGES, GAP_BETWEEN_EDGES, getHeight() + 1 - GAP_BETWEEN_EDGES);

        } else if (isO()) {
            g.drawOval(GAP_BETWEEN_EDGES, GAP_BETWEEN_EDGES, getWidth() - 2 * GAP_BETWEEN_EDGES, getHeight() - 2 * GAP_BETWEEN_EDGES);
            g.drawOval(GAP_BETWEEN_EDGES + 1, GAP_BETWEEN_EDGES + 1, getWidth() - 2 * GAP_BETWEEN_EDGES - 2, getHeight() - 2 * GAP_BETWEEN_EDGES - 2);  // makes line thicker

        }
    }


}
