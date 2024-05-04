import java.awt.*;

public class BigTicTacToeGame extends TicTacToeGame {
    private static final int SIZE_REDUCTION = 50;
    public BigTicTacToeGame() {
        super(0,0);
        setPreferredSize(new Dimension(GameFrame.WIDTH - SIZE_REDUCTION, GameFrame.HEIGHT - SIZE_REDUCTION));

        for (int i = 0; i < 9; i++) {
            add(new SmallTicTacToeGame(i / 3, i % 3));
        }

        setVisible(true);
    }


}
