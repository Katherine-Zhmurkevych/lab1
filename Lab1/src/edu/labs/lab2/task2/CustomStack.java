package edu.labs.lab2.task2;

import java.util.Iterator;


public class CustomStack<T> implements Iterable<T> {

    private T[] stackArray;
    private int top;
    private int currentSize;

    public CustomStack(final T[] incomeArray) {
        stackArray = incomeArray;
        this.currentSize = incomeArray.length;
        top = -1;
    }

    public void pushElement(final T element) {
        stackArray[++top] = element;
    }

    public T popElement() {
        return stackArray[top--];
    }

    public T getFirst() {
        return stackArray[top];
    }

    @Override
    public Iterator iterator() {
        Iterator<T> it = new Iterator<T>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < currentSize && stackArray[currentIndex] != null;
            }

            @Override
            public T next() {
                return stackArray[currentIndex++];
            }
        };
        return it;
    }
}