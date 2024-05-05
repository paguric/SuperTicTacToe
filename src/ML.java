import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

// Singleton pattern
public class ML implements MouseListener {
    private static ML instance = null;
    private static Cell lastClickedCell = null;

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

            if (lastClickedCell != null) {
                // if lastClickedCell points at an already won game, player can play anywhere

                if (!GamePanel.getInstance().isSmallGameWon(lastClickedCell.getRow(), lastClickedCell.getCol())) {
                    // selected game is valid if it is in the same row and column of last played cell
                    if (game.getRow() != lastClickedCell.getRow() || game.getCol() != lastClickedCell.getCol()) {
                        return;
                    }

                }

            }

            if (game.checkBox(e.getPoint())) {
                lastClickedCell = (Cell) game.getComponentAt(e.getPoint());
                GamePanel.getInstance().update();
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
