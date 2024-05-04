import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ML implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {
        TicTacToe ticTacToe = (TicTacToe) e.getSource();
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
