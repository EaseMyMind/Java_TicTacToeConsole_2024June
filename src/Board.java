public class Board {
    static int[] board;
    public Board(int n) {
        this.board = new int[n];
        for (int i = 0; i < 9; i++){
            getBoard()[i] = 2;
        }
    }

    public int[] getBoard() {
        return board;
    }
    public boolean checkWin(int[] board){
        if ((
                board[0] == 0 && board[1] == 0 && board[2] == 0)
                || (board[3] == 0 && board[4] == 0 && board[5] == 0)
                || (board[6] == 0 && board[7] == 0 && board[8] == 0)
                || (board[0] == 0 && board[3] == 0 && board[6] == 0)
                || (board[1] == 0 && board[4] == 0 && board[7] == 0)
                || (board[2] == 0 && board[5] == 0 && board[8] == 0)
                || (board[0] == 0 && board[4] == 0 && board[8] == 0)
                || (board[2] == 0 && board[4] == 0 && board[6] == 0)
        ){
            return true;
        }
        else if((
                board[0] == 1 && board[1] == 1 && board[2] == 1)
                || (board[3] == 1 && board[4] == 1 && board[5] == 1)
                || (board[6] == 1 && board[7] == 1 && board[8] == 1)
                || (board[0] == 1 && board[3] == 1 && board[6] == 1)
                || (board[1] == 1 && board[4] == 1 && board[7] == 1)
                || (board[2] == 1 && board[5] == 1 && board[8] == 1)
                || (board[0] == 1 && board[4] == 1 && board[8] == 1)
                || (board[2] == 1 && board[4] == 1 && board[6] == 1)
        ){
            return true;
        }
        return false;
    }
    public boolean isFilled(int play){
        if ((getBoard()[play] == 1) || (getBoard()[play] == 0)){
            return true;
        }else{
            return false;
        }
    }
    public boolean isTie(int[] board){
        int summ = 0;
        for(int i = 0; i < board.length; i++){
            summ = summ + board[i];
        }
        if(summ <= 5){
            return true;
        }else{
            return false;
        }
    }
}
