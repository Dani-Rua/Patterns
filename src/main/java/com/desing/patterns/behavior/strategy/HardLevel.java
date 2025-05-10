package com.desing.patterns.behavior.strategy;

public class HardLevel implements DifficultyLevelStrategy
{
    @Override
    public void modifyGameRules() {
        System.out.println("Hard level: The game is very challenging.");
    }
}
