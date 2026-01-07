package org.manoj.array;

public class MFastArray<T> {

    int size = 10;
    int currentIndex=0;
    Object[] data = null;

    public MFastArray(){
        data = new Object[size];
    }

    public void addValue(T value){
        if(null != value){
            data[currentIndex] = value;
            currentIndex++;
        }
    }

    public void printData(){
        IO.print("[ ");
        for(int i=0; i<currentIndex; i++){
            IO.print(data[i]+ " ");
        }
        IO.println("]");
    }
}
