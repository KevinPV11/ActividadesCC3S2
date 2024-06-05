package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class HintGeneratorTest {

    @Test
    public void testGenerateHint() {
        String word = "casa";
        String hint = HintGenerator.generateHint(word);
        assertEquals("_ _ _ _", hint);
    }
}
