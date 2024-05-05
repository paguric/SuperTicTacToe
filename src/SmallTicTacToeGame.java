import javax.swing.*;
import java.awt.*;

public class SmallTicTacToeGame extends TicTacToeGame {

    private Mark mark;
    private Cell[][] cells = new Cell[3][3];

    public SmallTicTacToeGame(int row, int col) {
        super(row, col);
        setPreferredSize(new Dimension(GameFrame.WIDTH / 3, GameFrame.HEIGHT / 3 ));

        for (int i = 0; i < 9; i++) {
            cells[i / 3][i % 3] = new Cell(i / 3, i % 3);
            super.add(cells[i / 3][i % 3]);
        }

        setVisible(true);
    }

    public boolean checkBox(Point p) {
        if (super.getComponentAt(p).getClass() != Cell.class || !((Cell) super.getComponentAt(p)).isEmpty()) {
            return false;
        }
        Cell cell = (Cell) super.getComponentAt(p);
        if (GamePanel.getInstance().getFirstPlayerTurn()) {
            cell.setX();
        } else {
            cell.setO();
        }
        return true;
    }

    // sets the mark of the whole small game, and paints it
    public void setMark(Mark mark) {
        this.mark = mark;
    }

    public Mark getMark() {
        return mark;
    }

    public boolean checkWin() {
        for (int i = 0; i < 3; i++) {
            if (checkRow(i) || checkCol(i)) {
                return true;
            }
        }
        return checkDiagonals();
    }

    private boolean checkRow(int row) {
        for (int i = 0; i < 3; i++) {
            if (cells[row][i].isEmpty() || cells[row][0].getMark() != cells[row][i].getMark()) {
                return false;
            }
        }
        return true;
    }

    private boolean checkCol(int col) {
        for (int i = 0; i < 3; i++) {
            if (cells[i][col].isEmpty() || cells[0][col].getMark() != cells[i][col].getMark()) {
                return false;
            }
        }
        return true;
    }

    private boolean checkDiagonals() {
        return (cells[0][0].getMark() == cells[1][1].getMark() && cells[1][1].getMark() == cells[2][2].getMark() && !cells[0][0].isEmpty()) ||
                (cells[0][2].getMark() == cells[1][1].getMark() && cells[1][1].getMark() == cells[2][0].getMark() && !cells[0][2].isEmpty());
    }

}
