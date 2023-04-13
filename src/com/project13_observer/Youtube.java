package com.project13_observer;
import com.project13_observer.Subject;

public class Youtube extends Subject{
    private String title = "YouTube.com";

    public Youtube() {
    }

    public Youtube(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        notify(title);
    }

}
