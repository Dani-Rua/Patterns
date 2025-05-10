package com.desing.patterns.behavior.strategy;

public class PuzzleGame {
    public static void main(String[] args) {
        Game game = new Game(new EasyLevel());
        game.play();

        game.setDifficultyLevelStrategy(new MediumLevel());
        game.play();

        game.setDifficultyLevelStrategy(new HardLevel());
        game.play();
    }
}
