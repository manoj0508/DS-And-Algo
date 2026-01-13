package org.manoj.array.program;

import org.manoj.array.MFastArray;


public class AddInMyArray {

    static void main() {

        MFastArray<Integer> list = new MFastArray<>();

        list.addValue(5);
        list.addValue(8);
        list.addValue(0);
        list.addValue(3);
        list.addValue(4);
        list.addValue(6);

        System.out.println(list.listSize());
        IO.println("get 3 index value : " + list.getValue(3));
        IO.println("find index of 4 : " + list.findIndex(4));
        IO.println("find index of 10 , a non existing value : " + list.findIndex(10));
        IO.println("first value : " + list.getFirstValue());
        IO.println("last value : "+ list.getLastValue());

        IO.println("set value : " +list.setValue(4, 123));

        IO.println("new value at index 4 : "+list.getValue(4));


        list.printData();
    }
}
