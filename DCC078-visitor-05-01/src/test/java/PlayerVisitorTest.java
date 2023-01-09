import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerVisitorTest {
    @Test
    void shouldBeShowPlayerMage(){
        PlayerMage playerMage = new PlayerMage("big_player", 100, 205.5f);

        PlayerVisitor playerVisitor = new PlayerVisitor();
        assertEquals("Mage: {name=big_player, hp='100', damage=205.5}", playerVisitor.show(playerMage));
    }

    @Test
    void shouldBeShowPlayerHunter(){
        PlayerHunter playerHunter = new PlayerHunter("first_player", 200, 100.5f);

        PlayerVisitor playerVisitor = new PlayerVisitor();
        assertEquals("Hunter: {name=first_player, hp='200', damage=100.5}", playerVisitor.show(playerHunter));
    }

    @Test
    void shouldBeShowPlayerTank(){
        PlayerTank playerTank = new PlayerTank("first_player", 200, 100.5f);

        PlayerVisitor playerVisitor = new PlayerVisitor();
        assertEquals("Tank: {name=first_player, hp='200', damage=100.5}", playerVisitor.show(playerTank));
    }
}