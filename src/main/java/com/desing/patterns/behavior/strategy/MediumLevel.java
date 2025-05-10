package com.desing.patterns.behavior.strategy;

public class MediumLevel implements DifficultyLevelStrategy
{
    @Override
    public void modifyGameRules() {
        System.out.println("Medium level: The game is moderately challenging.");
    }
}
