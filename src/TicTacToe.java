import javax.swing.*;
import java.awt.*;

public class TicTacToe extends JPanel implements TicTacToeGrid {


    @Override
    public void paint(Graphics g) {
        paintGrid(g);
    }
}
