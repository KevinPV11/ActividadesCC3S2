package org.example;

import java.util.Random;

public class WordSelector {
    private static final String[] WORDS = {"casa", "perro", "computadora", "juego", "sol"};

    public static String selectWord() {
        Random random = new Random();
        int index = random.nextInt(WORDS.length);
        return WORDS[index];
    }
}



