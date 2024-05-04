import javax.swing.*;
import java.awt.*;

public class Cell extends JPanel {
    private static final int GAP_BETWEEN_EDGES = 10;
    private boolean isX;
    private boolean isO;

    public Cell() {
        super();
//        setPreferredSize();
        isX = false;
        isO = false;
    }

    public void setX() {
        isX = true;
        isO = false;
    }

    public void setO() {
        isO = true;
        isX = false;
    }

    public boolean isX() {
        return isX;
    }

    public boolean isO() {
        return isO;
    }

    public boolean isEmpty() {
        return !isX && !isO;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (isX) {
            g.drawLine(GAP_BETWEEN_EDGES, GAP_BETWEEN_EDGES, getWidth() - GAP_BETWEEN_EDGES, getHeight() - GAP_BETWEEN_EDGES);  // main diagonal
            g.drawLine(GAP_BETWEEN_EDGES + 1, GAP_BETWEEN_EDGES, getWidth() + 1 - GAP_BETWEEN_EDGES, getHeight() - GAP_BETWEEN_EDGES);  // makes line wider


            g.drawLine(getWidth() - GAP_BETWEEN_EDGES, GAP_BETWEEN_EDGES, GAP_BETWEEN_EDGES, getHeight() - GAP_BETWEEN_EDGES);  // secondary diagonal
            g.drawLine(getWidth() + 1 - GAP_BETWEEN_EDGES, GAP_BETWEEN_EDGES, GAP_BETWEEN_EDGES, getHeight() + 1 - GAP_BETWEEN_EDGES);




        } else if (isO) {
            g.drawOval(GAP_BETWEEN_EDGES, GAP_BETWEEN_EDGES, getWidth() - 2 * GAP_BETWEEN_EDGES, getHeight() - 2 * GAP_BETWEEN_EDGES);
            g.drawOval(GAP_BETWEEN_EDGES + 1, GAP_BETWEEN_EDGES + 1, getWidth() - 2 * GAP_BETWEEN_EDGES - 2, getHeight() - 2 * GAP_BETWEEN_EDGES - 2);  // makes line thicker

        }
    }

}
