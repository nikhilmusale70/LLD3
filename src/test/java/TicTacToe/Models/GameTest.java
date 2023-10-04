package TicTacToe.Models;


import TicTacToe.Strategies.Playing.RandomPlayingStrategy;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;

class GameTest {

    private static final int BOARD_SIZE = 3; //Screaming case
    @Test
    public void testCreateGame(){
        Game game = Game.builder()
                .withSize(BOARD_SIZE)
                .withPlayer(new HumanPlayer(GameSymbol.O, new User()))
                .withPlayer(new BotPlayer(GameSymbol.X, GameLevel.EASY, new RandomPlayingStrategy()))
                .build();

        assertEquals("if game created, it should have 2 players", 2, game.players.size());
    }

    @Test
    public void testCreateBoard(){
        Board board = new Board(BOARD_SIZE);
        int rowSize = board.getCells().size();
        assertEquals("Check if row size is equal",3, rowSize);

        int colSize = board.getCells().get(0).size();
        assertEquals("Check if col size is equal",3, rowSize);

    }
}