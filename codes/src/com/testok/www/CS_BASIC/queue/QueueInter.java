package com.testok.www.CS_BASIC.queue;

public interface QueueInter {
        boolean isEmpty();
        boolean isFull();
        void enqueue(char item);
        char dequeue();
        char peek();
        void clear();

}
