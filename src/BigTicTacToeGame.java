import java.awt.*;

public class BigTicTacToeGame extends TicTacToeGame {
    public BigTicTacToeGame() {
        super(0,0);
        setPreferredSize(new Dimension(GameFrame.WIDTH, GameFrame.HEIGHT));

        for (int i = 0; i < 9; i++) {
            super.add(new SmallTicTacToeGame(i / 3, i % 3));
        }

    }

}
