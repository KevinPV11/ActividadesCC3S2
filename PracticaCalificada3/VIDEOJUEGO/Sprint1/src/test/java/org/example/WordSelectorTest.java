package org.example;
import org.junit.Test;
import static org.junit.Assert.*;


public class WordSelectorTest {
    @Test
    public void testSelectWord() {
        String word = WordSelector.selectWord();
        assertNotNull(word);
        assertTrue(word.length() > 0);
    }

}