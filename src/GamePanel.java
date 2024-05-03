import javax.swing.*;
import java.awt.*;

// Singleton pattern
public class GamePanel extends JPanel {
    private static GamePanel instance = null;

    private GamePanel() {
        super(new GridLayout(3, 3));
        setPreferredSize(new Dimension(GameFrame.WIDTH, GameFrame.HEIGHT));

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
//        super.paint(g);

        g.setColor(Color.BLACK);
        g.drawLine(GameFrame.WIDTH / 3, 0, GameFrame.WIDTH / 3, GameFrame.HEIGHT);
        g.drawLine(2 * GameFrame.WIDTH / 3, 0, 2 * GameFrame.WIDTH / 3, GameFrame.HEIGHT);
        g.drawLine(0, GameFrame.HEIGHT / 3, GameFrame.WIDTH, GameFrame.HEIGHT / 3);
        g.drawLine(0, 2 * GameFrame.HEIGHT / 3, GameFrame.WIDTH, 2 * GameFrame.HEIGHT / 3);
    }

}
