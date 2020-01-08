
public class TestGame extends TestCase {

    public void testTwoPlayersGame() {

        Game game = new Game()
        assertTrue(game.startGameForTwoPlayers(10,"Test1","Test2") == true);
        assertFalse(game.startGameForTwoPlayers(10,"Test1","Test2") == false);
    }

}