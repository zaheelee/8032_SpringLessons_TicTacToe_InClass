import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.*;

public class TicTacToe 
{

    /*
    TODO write your own tic tac toe game!

    Requirements:
    - there can be two players
    - players take turns (i.e. player 0 goes, then player 1 goes, etc)
    - players input their turns in the terminal while the main loop is running
    - there can be a winner
    - there can be a tie
    - all fields in the Board class are private
    */

    public static void main(String[] args) throws Exception
    {
        System.out.println("Hello, World!");

        Board board = new Board();

        // A BufferedReader allows you to take in input strings from the terminal
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        // This is the main game loop
        boolean isP1 = true;
        while(!board.isGameOver())
        {
            System.out.println(board.displayBoard());
            // An example of how to use BufferedReader:
            String num = reader.readLine();
            int X = (Integer.parseInt(num)-1)%3;
            int Y = (int)Math.floor((Integer.parseInt(num)-1))/3;

            // TODO Think about what kind of inputs this function may need.
            board.takeTurn(isP1,X,Y);
            isP1=!isP1;
        }

        System.out.println(board.displayBoard());

        System.out.println(("Player "+board.testAllBoardSpace()+" WINS!"));
    }
}
