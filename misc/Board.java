package misc;
import java.io.*;
import java.util.*;
public class Board {
    // The board has 32 pieces, 64 squares and an evaluation in somebody's favour
    public double evaluation;
    public String[][] squares = new String[8][8];
    
    // Constructors
    public Board(double evaluation, String[][] squares) {
        this.evaluation = evaluation;
        this.squares = squares;
    };

    // No arg constructor for testing
    public Board() {
    }

    public void makeBoard() {
        char aChar = 'A';
        int start = 8;
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                this.squares[row][col] = "" + aChar + start;
                aChar++;
            }
            aChar = 'A';
            start--;
        }
    }
    public void toTextFile(Board b) throws IOException{
        try{
            FileWriter file = new FileWriter("board.txt");
            BufferedWriter output = new BufferedWriter(file);
            for(int i = 0; i<b.squares.length; i++){
                for(int j = 0; j < b.squares.length; j++){
                    output.write(b.squares[i][j]);
                }
                output.newLine();
            }
            output.close();
        }
        catch(IOException e){
            e.getMessage();
        }
    }

}