package com.project13_observer;

public class Cxeni extends Observer {
    @Override
    public void update(Object... args) {
        String title = (String) args [0];
        System.out.println("I noticed that youtube changed title to: " + title);
    }
}
