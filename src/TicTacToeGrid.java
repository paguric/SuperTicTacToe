import javax.swing.*;
import java.awt.*;

public interface TicTacToeGrid {

    int getX();
    int getY();

    int getWidth();
    int getHeight();

    default void paintGrid(Graphics g) {
        g.setColor(Color.BLACK);

        g.drawLine(getWidth() / 3, getY(), getWidth() / 3, getHeight());

        g.drawLine(2 * getWidth() / 3, getY(), 2 * getWidth() / 3, getHeight());

        g.drawLine(getX(), getHeight() / 3, getWidth(), getHeight() / 3);

        g.drawLine(getX(), 2 * getHeight() / 3, getWidth(), 2 * getHeight() / 3);

    }
}