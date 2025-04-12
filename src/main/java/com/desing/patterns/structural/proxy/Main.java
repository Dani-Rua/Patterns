package com.desing.patterns.structural.proxy;

public class Main {

    public static void main(String[] args){

        IVideo proxyVideo = new VideoProxy("C:/video.mp4");

        proxyVideo.stop();
        proxyVideo.play();
        proxyVideo.stop();
        proxyVideo.play();
        proxyVideo.stop();
        proxyVideo.play();
    }
}
