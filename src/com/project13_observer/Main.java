package com.project13_observer;

public class Main {
    public static void main(String[] args) {
        Youtube youtube = new Youtube();
        Cxeni cxeni = new Cxeni();
        youtube.subscribe(cxeni);
        youtube.setTitle("Youtube.com");


        youtube.unsubscribe(cxeni);
        youtube.setTitle("YouTube.com");
    }
}