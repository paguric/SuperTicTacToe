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

        if (e.getSource().getClass() == SmallTicTacToeGame.class) {

            SmallTicTacToeGame game = (SmallTicTacToeGame) e.getSource();
            if (game.checkBox(e.getPoint())) {
                GamePanel.getInstance().switchTurn();
            }

        }

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
