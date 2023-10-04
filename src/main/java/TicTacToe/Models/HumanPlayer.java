package TicTacToe.Models;

//Extrinsic state

public class HumanPlayer extends Player{
   private User user;

    public HumanPlayer(GameSymbol symbol, User user) {
        super(symbol);
        this.user = user;
    }

    @Override
    public BoardCell play(Board board) {
        return null;
    }
}
