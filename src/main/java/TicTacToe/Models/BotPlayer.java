package TicTacToe.Models;

import TicTacToe.Strategies.Playing.PlayingStrategy;
import lombok.AllArgsConstructor;

public class BotPlayer extends Player{
    private GameLevel level;
    private PlayingStrategy playingStrategy;

    BotPlayer(GameSymbol symbol, GameLevel level, PlayingStrategy playingStrategy){
        super(symbol);
        this.playingStrategy = playingStrategy;
        this.level = level;
    }

    @Override
    public BoardCell play(Board board) {
        return playingStrategy.makeMove(board);
    }
}
