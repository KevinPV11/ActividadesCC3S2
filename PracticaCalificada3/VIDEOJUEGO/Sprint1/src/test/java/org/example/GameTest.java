package org.example;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class GameTest {

    private Game game;

    @Before
    public void setUp() {
        game = new Game();
    }

    @Test
    public void testGenerateFeedback() {
        String feedback = game.generateFeedback("casa");
        assertNotNull(feedback);

    }

    @Test
    public void testPlay() {
        // Simular la entrada del usuario
        String input = "casa\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);


        game.play();
    }
}