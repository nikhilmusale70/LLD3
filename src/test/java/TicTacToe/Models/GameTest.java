package TicTacToe.Models;


import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;

class GameTest {
    @Test
    public void testCreateGame(){
        Board board = new Board(3);

//        Game game = new Game();
    }

    @Test
    public void testCreateBoard(){
        Board board = new Board(2);
        int rowSize = board.getCells().size();
        assertEquals("Check if row size is equal",3, rowSize);

        int colSize = board.getCells().get(0).size();
        assertEquals("Check if col size is equal",3, rowSize);

    }
}