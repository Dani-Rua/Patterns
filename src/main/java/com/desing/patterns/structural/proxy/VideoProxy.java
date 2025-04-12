package com.desing.patterns.structural.proxy;

public class VideoProxy implements IVideo{

    private Video video;
    private String path;

    public VideoProxy(String path){
        this.path = path;
    }

    @Override
    public void play() {
        if (video == null) {
            video = new Video(path);
        }
        video.play();
    }

    @Override
    public void stop() {
        if (video != null)
        video.stop();
    }

    @Override
    public void pause() {
        if (video != null)
         video.pause();
    }
}
