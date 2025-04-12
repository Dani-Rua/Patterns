package com.desing.patterns.structural.proxy;

public class Video implements IVideo{

    private long size;
    private String path;
    private String format;

    public Video (String path){
        System.out.println("Cargando el video..."+ path);
        this.path = path;
        size = 10001;
        format = "MPEG";
    }

    @Override
    public void play() {
        System.out.println("Reproduciendo  video"+ path);
    }

    @Override
    public void stop() {
        System.out.println("Para video"+path);
    }

    @Override
    public void pause() {
        System.out.println("Pausando video"+path);
    }

    public void load() {

    }
}
