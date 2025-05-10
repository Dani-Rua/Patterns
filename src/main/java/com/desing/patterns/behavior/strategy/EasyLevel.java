package com.desing.patterns.behavior.strategy;

public class EasyLevel implements DifficultyLevelStrategy
{
    @Override
    public void modifyGameRules() {
        System.out.println("Easy level: The game is easy to play.");
    }
}
