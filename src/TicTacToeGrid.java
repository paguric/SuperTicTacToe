import javax.swing.*;
import java.awt.*;

public interface TicTacToeGrid {

    static final int GAP_BETWEEN_EDGES = 0;

    int getRow();
    int getCol();

    int getWidth();
    int getHeight();

    default void paintGrid(Graphics g) {

        if (!(getRow() < 0 || getCol() < 0)) {
            g.setColor(Color.GRAY);
        }

        int row = Math.max(getRow(), 0);
        int col = Math.max(getCol(), 0);

        int width = getWidth();
        int height = getHeight();

        int[] point1 = new int[] {width / 3 + col * width, height * row + GAP_BETWEEN_EDGES};
        int[] point2 = new int[] {width / 3 + col * width, height * (row + 1) - GAP_BETWEEN_EDGES};

        g.drawLine(point1[0], point1[1], point2[0], point2[1]);

        int[] point3 = new int[] {2 * width / 3 + col * width, height * row + GAP_BETWEEN_EDGES};
        int[] point4 = new int[] {2 * width / 3 + col * width, height * (row + 1) - GAP_BETWEEN_EDGES};

        g.drawLine(point3[0], point3[1], point4[0], point4[1]);

        int[] point5 = new int[] {width * col + GAP_BETWEEN_EDGES , height / 3 + row * height};
        int[] point6 = new int[] {width * (col + 1) - GAP_BETWEEN_EDGES, height / 3 + row * height};

        g.drawLine(point5[0], point5[1], point6[0], point6[1]);

        int[] point7 = new int[] {width * col + GAP_BETWEEN_EDGES, 2 * height / 3 + row * height};
        int[] point8 = new int[] {width * (col + 1) - GAP_BETWEEN_EDGES, 2 * height / 3 + row * height};

        g.drawLine(point7[0], point7[1], point8[0], point8[1]);

    }
}