import javax.swing.*;
import java.awt.*;

// Singleton pattern
public class GameFrame extends JFrame implements Runnable {
    private static GameFrame instance = null;
    public static final int WIDTH = 800;
    public static final int HEIGHT = 800;
    public static final int FRAMES_PER_SECOND = 30;
    private volatile boolean shutdown = false;

    private GameFrame() {
        setTitle("Super Tic Tac Toe");
        setSize(new Dimension(WIDTH, HEIGHT));
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    public static GameFrame getInstance() {
        if (instance == null) {
            instance = new GameFrame();
        }
        return instance;
    }

    private void update(double dt) {

    }

    @Override
    public void run() {
        double lastFrameTime = 0.0;
        while (!shutdown) {
            double time = Time.getTime();
            double deltaTime = time - lastFrameTime;
            lastFrameTime = time;

            update(deltaTime);

            try {
                Thread.sleep(FRAMES_PER_SECOND);
            } catch (Exception e) {

            }

        }
    }
}
