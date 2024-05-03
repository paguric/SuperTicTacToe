import javax.swing.*;
import java.awt.*;

// Singleton pattern
public class GamePanel extends JPanel implements TicTacToeGrid {
    private static GamePanel instance = null;

    private GamePanel() {
        super(new GridLayout(3, 3));
        setPreferredSize(new Dimension(GameFrame.WIDTH, GameFrame.HEIGHT));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                add(new TicTacToe(i, j));
            }
        }

        Color background = Color.GRAY;
        for (int i = 0; i < 9; i++) {
            getComponent(i).setBackground(background);
            if (background == Color.GRAY) {
                background = Color.LIGHT_GRAY;
            } else {
                background = Color.GRAY;
            }
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

    @Override
    public int getRow() {
        return 0;
    }

    @Override
    public int getCol() {
        return 0;
    }

}
