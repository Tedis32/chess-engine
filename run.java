import misc.Board;

import java.io.IOException;
import java.util.*;
public class run {
    public static void main(String[] args) throws IOException {
        Board board = new Board();
        board.makeBoard();
        //System.out.println(Arrays.deepToString(board.squares));
        board.toTextFile(board);

    }
}
