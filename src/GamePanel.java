import javax.swing.*;
import java.awt.*;

// Singleton pattern
public class GamePanel extends JPanel {
    private static GamePanel instance = null;

    private static BigTicTacToeGame mainGame = new BigTicTacToeGame(); // the bigger game containing the other 9 games

    private GamePanel() {
        super();


        add(mainGame);

        setVisible(true);
    }

    public static GamePanel getInstance() {
        if (instance == null) {
            instance = new GamePanel();
        }
        return instance;
    }

    @Override
    public void paint(Graphics g) {

        mainGame.paint(g);
        for (int i = 0; i < 9; i++) {
            mainGame.getComponent(i).paint(g);
        }

    }

}
