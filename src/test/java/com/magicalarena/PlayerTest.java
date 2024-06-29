package test.java.com.magicalarena;

import org.junit.jupiter.api.Test;

import main.java.com.magicalarena.Player;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Test
    void testPlayerInitialization() {
        Player player = new Player(50, 5, 10);
        assertEquals(50, player.getHealth());
        assertEquals(5, player.getStrength());
        assertEquals(10, player.getAttack());
    }

    @Test
    void testPlayerHealthModification() {
        Player player = new Player(50, 5, 10);
        player.setHealth(40);
        assertEquals(40, player.getHealth());
    }

    @Test
    void testPlayerIsAlive() {
        Player player = new Player(50, 5, 10);
        assertTrue(player.isAlive());
        player.setHealth(0);
        assertFalse(player.isAlive());
    }
}
