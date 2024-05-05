import javax.swing.*;
import java.awt.*;

// Singleton pattern
public class GamePanel extends JPanel {
    private static GamePanel instance = null;

    private static BigTicTacToeGame mainGame = new BigTicTacToeGame(); // the bigger game containing the other 9 games
    private static boolean firstPlayerTurn = true;

    private GamePanel() {
        setPreferredSize(new Dimension(GameFrame.WIDTH, GameFrame.HEIGHT));

        add(mainGame);

        setVisible(true);
    }

    public static GamePanel getInstance() {
        if (instance == null) {
            instance = new GamePanel();
        }
        return instance;
    }

    public void update() {
        mainGame.update();
        switchTurn();
    }

    public boolean isSmallGameWon(int row, int col) {
        return mainGame.getComponent(row * 3 + col) instanceof Cell;
    }

    private void switchTurn() {
        firstPlayerTurn = !firstPlayerTurn;
    }

    public boolean getFirstPlayerTurn() {
        return firstPlayerTurn;
    }

}
