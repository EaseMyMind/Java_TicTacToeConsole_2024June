import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Board board = new Board(9);
        System.out.println("Победитель: " + playGame(board));
    }
    private static String playGame(Board board){
        Player playerX = new Player(1, board);
        Player playerO = new Player(0, board);

        Scanner scan = new Scanner(System.in);

        Player currPlayer;
        int turnCount = 0;
        Boolean keepPlaying = true;
        int play;
        Boolean hasWon = false;
        String winner = "Tie";

        while(keepPlaying){
            if (turnCount % 2 == 0){
                currPlayer = playerX;
            }else{
                currPlayer = playerO;
            }
            System.out.println("Игрок, " + currPlayer.getName() + " введите номер клетки от 1 до 9, в которую хотите поставить символ");
            try{
                play = scan.nextInt();
            }catch(InputMismatchException ex){
                System.out.println("Вы ввели номер несуществующей клетки. Попробуйте снова");
                scan = new Scanner(System.in);
                continue;
            }
            if (!board.isFilled(play - 1)){
                currPlayer.makePlay(play - 1);
            }else{
                System.out.println("Вы ввели номер уже заполненной клетки. Попробуйте снова");
                continue;
            }
            turnCount = turnCount + 1;
            if(board.isTie(board.getBoard())){
                break;
            }
            if(board.checkWin(board.getBoard())){
             hasWon = true;
            }
            if(hasWon){
                winner = currPlayer.getName();
                keepPlaying = false;
            }
        }
        return winner;
    }
}
