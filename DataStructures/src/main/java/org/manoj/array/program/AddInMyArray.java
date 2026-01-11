package org.manoj.array.program;

import org.manoj.array.MFastArray;

import java.util.ArrayList;
import java.util.List;

public class AddInMyArray {

    static void main(String[] args) {

        MFastArray<Integer> list = new MFastArray<>();

        ArrayList<String> arrayList = new ArrayList<>();

        list.addValue(5);
        list.addValue(8);
        list.addValue(0);
        list.addValue(3);
        list.addValue(4);
        list.addValue(6);

        System.out.println(list.listSize());
        IO.println("get 3 index value : " + list.getValue(3));
        IO.println("find index of 6 : " + list.findIndex(6));
        IO.println("find index of 10 , a non existing value : " + list.findIndex(10));
        IO.println("first value : " + list.getFirstValue());
        IO.println("last value : "+ list.getLastValue());


        list.printData();
    }
}
