package seventhClass;

import java.util.Scanner;

/**
 * Created by boruto on 6/27/17.
 */
public class TickTackToeMain {
    public static void main(String[] args) {
        TickTacToeClass t = new TickTacToeClass();
        Scanner scanner = new Scanner(System.in);
        String player1Position;
        String player2Position;

        boolean status;

        int i=0;
        while (i<=9) {
            t.display();
            System.out.println("Player 1:");
            player1Position = scanner.next();
            t.setPlayer1Position(player1Position);
            t.setHolder1();
            status=t.gameStatus();
            i++;
            if(i==9){
                System.out.println("draw");
                break;
            }
            if(status==true)
            {
                t.display();
                break;
            }

            t.display();
            System.out.println("Player 2:");
            player2Position = scanner.next();
            t.setPlayer2Position(player2Position);
            t.setHolder2();
            status=t.gameStatus();
            i++;

            if(status==true)
                break;

        }

    }
}
