package com.project13_observer.collection;

import com.project13_observer.Observer;

import java.util.Objects;

public class ObserverNode {

    private ObserverNode prev;
    private ObserverNode next;
    private Observer value;

    public ObserverNode(ObserverNode prev, ObserverNode next, Observer value) {
        this.prev = prev;
        this.next = next;
        this.value = value;
    }

    public ObserverNode getPrev() {
        return prev;
    }

    public void setPrev(ObserverNode prev) {
        this.prev = prev;
    }

    public ObserverNode getNext() {
        return next;
    }

    public void setNext(ObserverNode next) {
        this.next = next;
    }

    public Observer getValue() {
        return value;
    }

    public void setValue(Observer value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObserverNode that = (ObserverNode) o;
        return Objects.equals(prev, that.prev) && Objects.equals(next, that.next) && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prev, next, value);
    }

    @Override
    public String toString() {
        return "ObserverNode{" +
                "prev=" + prev +
                ", next=" + next +
                ", value=" + value +
                '}';
    }
}
