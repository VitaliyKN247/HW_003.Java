package org.example.Game;

public interface Game {
    void start( Integer sizeWord, Integer maxTry);
    Answer inputAnswer(String value);
    GameStatus getGameStatus();


}
