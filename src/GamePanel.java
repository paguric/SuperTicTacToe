import javax.swing.*;
import java.awt.*;

// Singleton pattern
public class GamePanel extends JPanel {
    private static GamePanel instance = null;

    private static BigTicTacToeGame mainGame = new BigTicTacToeGame(); // the bigger game containing the other 9 games

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

}
