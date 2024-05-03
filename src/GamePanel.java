import javax.swing.*;
import java.awt.*;

// Singleton pattern
public class GamePanel extends JPanel implements TicTacToeGrid {
    private static GamePanel instance = null;

    private GamePanel() {
        super(new GridLayout(3, 3));
        setPreferredSize(new Dimension(GameFrame.WIDTH, GameFrame.HEIGHT));

        for (int i = 0; i < 9; i++) {
            add(new TicTacToe());
        }

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
        paintGrid(g);

        for (int i = 0; i < 9; i++) {
            getComponent(i).paint(g);
        }
    }

}
