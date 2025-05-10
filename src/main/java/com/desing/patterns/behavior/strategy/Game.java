package com.desing.patterns.behavior.strategy;

public class Game {
    private DifficultyLevelStrategy difficultyLevelStrategy;

    public Game(DifficultyLevelStrategy difficultyLevelStrategy) {
        this.difficultyLevelStrategy = difficultyLevelStrategy;
    }

    public void setDifficultyLevelStrategy(DifficultyLevelStrategy difficultyLevelStrategy) {
        this.difficultyLevelStrategy = difficultyLevelStrategy;
    }

    public void play() {
        difficultyLevelStrategy.modifyGameRules();
    }
}
