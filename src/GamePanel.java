import javax.swing.*;
import java.awt.*;

// Singleton pattern
public class GamePanel extends JPanel {
    private static GamePanel instance = null;

    private static TicTacToe mainGame; // the bigger game containing the other 9 games

    private GamePanel() {
        super();

        mainGame = new TicTacToe(-1,-1);
        mainGame.setPreferredSize(new Dimension(GameFrame.WIDTH, GameFrame.HEIGHT));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mainGame.add(new TicTacToe(i, j));
            }
        }

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
