package org.manoj.array;

import java.io.Serializable;
import java.util.Arrays;
import java.util.RandomAccess;

public class MFastArray<T> implements RandomAccess, Serializable {

    private final int default_size = 10;
    private int currentIndex = 0;
    transient Object[] data;

    public MFastArray() {
        data = new Object[default_size];
    }

    public void addValue(T value) {
        if (null != value) {
            if (currentIndex >= data.length) {
                increaseArraySize();
            }
            data[currentIndex] = value;
            currentIndex++;
        }
    }

    @SuppressWarnings("unchecked")
    public T getValue(int index) {
        if (index < currentIndex) {
            return (T) data[index];
        }
        return null;
    }

    public T getFirstValue() {
        return getValue(0);
    }

    public T getLastValue() {
        return getValue(currentIndex - 1);
    }

    public int findIndex(T value) {
        for (int i = 0; i < currentIndex; i++) {
            if (data[i] == value) {
                return i;
            }
        }
        return -1;
    }


    private void increaseArraySize() {
        if (currentIndex >= default_size) {
            int newSize = currentIndex * 2;
            data = Arrays.copyOf(data, newSize);
        }
    }


    public void printData() {
        IO.print("[ ");
        for (int i = 0; i < currentIndex; i++) {
            IO.print(data[i] + " ");
        }
        IO.println("]");
    }

    public int listSize() {
        return currentIndex;
    }


    public T removeByIndex(int index) {
        if (index < currentIndex) {
            T value = getValue(index);
            System.arraycopy(data, index + 1, data, index, currentIndex - index);
            currentIndex--;
            return value;
        }
        return null;
    }

    public T removeByValue(T value) {
        int index = findIndex(value);
        if (index != -1) {
            return removeByIndex(index);
        }
        return null;
    }

    public boolean setValue(int index, T value){
        if(index < currentIndex){
            data[index] = value;
            return true;
        }else {
           throw new IndexOutOfBoundsException("Index "+index+" out of bounds for length"+ currentIndex);
        }
    }
}
