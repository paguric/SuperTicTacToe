import javax.swing.*;
import java.awt.*;

// Singleton pattern
public class GameFrame extends JFrame implements Runnable {
    private static GameFrame instance = null;
    public static final int WIDTH = 800;
    public static final int HEIGHT = 800;

    private GameFrame() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static GameFrame getInstance() {
        if (instance == null) {
            instance = new GameFrame();
        }
        return instance;
    }

    @Override
    public void run() {

    }
}
