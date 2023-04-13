package com.project13_observer.collection;

import com.project13_observer.Observer;

public class ObserverLinkedList {

    private ObserverNode head;

    public void add(Observer observer) {
        add(new ObserverNode(null, null, observer));
    }

    public void add(ObserverNode node) {
        node.setNext(null);
        if (head == null) {
            node.setPrev(null);
            head = node;
            return;
        }
        ObserverNode tmpNode = head;
        while (tmpNode.getNext() != null) {
            tmpNode = head.getNext();
        }
        tmpNode.setNext(node);
        node.setPrev(tmpNode);
    }

    public void remove(Observer observer) {
        remove(new ObserverNode(null, null, observer));
    }

    public void remove(ObserverNode node) {
        if (head == null) {
            return;
        }
        ObserverNode tmpNode = head;
        while (tmpNode.getNext() != null) {
            if (tmpNode.getNext().equals(node.getValue())) {
                //Remove node
                if (tmpNode.getNext() != null) {
                    tmpNode.getPrev().setNext(tmpNode.getNext());
                }
                if (tmpNode.getNext() != null) {
                    tmpNode.getNext().setPrev(tmpNode.getPrev());
                }
            }
            tmpNode = head.getNext();
        }
    }

    public class Iterator {
        private ObserverNode currentNode = null;

        public boolean hasNext() {
            if (currentNode == null) {
                return head != null;
            }
            return currentNode.getNext() != null;
        }

        public ObserverNode next() {
            if (currentNode == null) {
                return head;
            }
            return currentNode.getNext();
        }
    }
}
