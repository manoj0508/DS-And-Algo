package org.manoj.array.program;

import org.manoj.array.MFastArray;

public class AddInMyArray {

    static void main(String [] args){
        MFastArray<Integer> list = new MFastArray<>();

        list.addValue(5);
        list.addValue(8);

        list.printData();
    }
}
