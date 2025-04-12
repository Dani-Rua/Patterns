package com.desing.patterns.behavior.command;

public class PlayEngine {

    Integer status = 0;


    public Integer getStatus(){
        return status;
    }

    public void play(){
        status = 1;
    }

    public void stop(){
        status = 0;
    }

    public void pausa(){

    }
}
