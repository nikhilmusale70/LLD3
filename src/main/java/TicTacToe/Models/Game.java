package TicTacToe.Models;

import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@AllArgsConstructor
public class Game {
    private Board board;
    private static final GameStatus DEFAULT_STATUS = GameStatus.IN_PROGRESS;
    List<Player> players = new ArrayList<>();
    private GameStatus status;
    private static final int PLAYER_COUNT = 2;
    private Game(){

    }

    public void start() {}
    public void makeMove() {}
    public static Builder builder(){
        return new Builder();
    }
    private Player checkWinner() {
        return null;
    }

    private boolean checkDraw(){
        return false;
    }

    static class Builder{
        private Game game;
        public Builder(){
            game = new Game();
        }

        public Builder withSize(int size){
            this.game.board =  new Board(size);
            return this;
        }

        public Builder withPlayer(Player player){
            game.players.add(player);
            return this;
        }

        public Game build(){
            boolean isValid = validate();
            if(!isValid){
                throw new RuntimeException();
            }

            Game newGame = new Game();
            newGame.board = game.board;
            newGame.players = game.players;
            newGame.status = DEFAULT_STATUS;
            return newGame;
        }

        private boolean validate(){
            List<Player> players = game.players;
            if(game.players.size() < 2){
                return false;
            }

            Set<GameSymbol> symbols = players.stream().map(Player::getSymbol).collect(Collectors.toSet());
            if(symbols.size() != PLAYER_COUNT){
                return false;
            }
            return true;
        }
    }
}
