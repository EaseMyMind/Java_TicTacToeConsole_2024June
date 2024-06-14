public class Player {
    int symbol;
    Board board;
    public Player(int symbol, Board board) {
        this.symbol = symbol;
        this.board = board;
    }
    public void makePlay(int n){
        board.getBoard()[n] = symbol;
    }

    public String getName() {
        if (symbol == 1) {
            return "playerX";
        }else{
            return "playerO";
        }
    }

}
