import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

// Singleton pattern
public class ML implements MouseListener {
    private static ML instance = null;

    private ML() {
    }

    public static ML getInstance() {
        if (instance == null) {
            instance = new ML();
        }
        return instance;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        TicTacToeGame ticTacToe = (TicTacToeGame) e.getSource();
        Component component = ticTacToe.getComponentAt(e.getPoint());


    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
