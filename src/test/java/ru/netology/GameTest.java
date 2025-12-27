package ru.netology;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    Game game = new Game();


    @Test
    void test1PlayerWin() throws Throwable {
        Player player1 = new Player(1,"Василиск",4);
        Player player2 = new Player(2,"Камазот",3);

        game.register(player1);
        game.register(player2);

        int expected = game.round("Василиск", "Камазот");
        assertEquals(1, expected);
    }

    @Test
    void test2PlayerWin() throws Throwable {
        Player player1 = new Player(1,"Василиск",4);
        Player player2 = new Player(2,"TOR",8);

        game.register(player1);
        game.register(player2);

        int expected = game.round("Василиск", "TOR");
        assertEquals(2, expected);
    }

    @Test
    public void testGameDraw() throws Throwable {
        Game game = new Game();
        Player player1 = new Player(1, "A", 100);
        Player player2 = new Player(2, "B", 100);

        game.register(player1);
        game.register(player2);

        int expected = game.round("A", "B");
        assertEquals(0, expected);
    }

    @Test
    public void testNotRegisteredPlayer() {
        Game game = new Game();
        Player player1 = new Player(1, "B", 100);
        Player player2 = new Player(2, "C", 100);

        game.register(player1);

        assertThrows(NotRegisteredException.class, () -> {game.round("A","B");});

    }
}