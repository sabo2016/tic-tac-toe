package seventhClass;

/**
 * Created by boruto on 6/27/17.
 */
public class TickTacToeClass {

    private String[][]holder = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
    private String  player1Position;
    private String player2Position;


    public void setPlayer1Position(String player1Position){
        this.player1Position = player1Position;
    }

    public void setPlayer2Position(String player2Position){
        this.player2Position = player2Position;
    }

    public void setHolder1(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(holder[i][j]!="X" && holder[i][j]!="O") {
                    if (player1Position.equals(holder[i][j])) {
                        holder[i][j] = "X";
                    }
                }

            }
        }
    }

    public void setHolder2(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++) {
                if (holder[i][j] != "X" && holder[i][j] != "O") {
                    if (player2Position.equals(holder[i][j])) {
                        holder[i][j] = "O";
                    }
                }

            }
        }
    }


    public boolean gameStatus(){
        for (int i=0;i<3;i++){//row
            int j=0;
                if(holder[i][j] == holder[i][j+1] && holder[i][j+1] == holder[i][j+2]){
                    if(holder[i][j]=="X")
                        System.out.println("player1 wins");
                    else {
                        System.out.println("player2 wins");
                    }
                    return true;
                }


        }
        for(int j=0;j<3;j++){//column
            int i=0;
            if(holder[i][j] == holder[i+1][j] && holder[i+1][j] == holder[i+2][j]){
                if(holder[i][j]=="X")
                    System.out.println("player1 wins");
                else {
                    System.out.println("player2 wins");
                }
                return true;
            }
        }

            if(holder[0][0] == holder[1][1]&&holder[1][1] == holder[2][2]){
                if(holder[0][0]=="X")
                    System.out.println("player1 wins");
                else {
                    System.out.println("player2 wins");
                }
                return true;
            }


        if(holder[0][2] == holder[1][1] && holder[1][1] == holder[2][0]){
            if(holder[1][1] == "X"){
                System.out.println("player1 wins");
            }
            else {
                System.out.println("player2 wins");
            }
            return true;
        }
        return false;
    }


    public void display(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(holder[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
