import org.manoj.array.MFastArray;

void main() {
    IO.println("Add and remove element from MFastArray");
    MFastArray<String> list = new MFastArray<>();
    addInMArray(list);

    list.printData();
    removeFromMArray(list);

    list.printData();

    list.addValue("Apple");
    list.addValue("Mango");

    list.printData();

    removeFromMArrayByValue(list);

    list.printData();
}


public void addInMArray(MFastArray<String> list) {

    list.addValue("First");
    list.addValue("Second");
    list.addValue("Third");
}

void removeFromMArray(MFastArray<String> list) {

    String remove = list.removeByIndex(1);
    IO.println("removed data from index 1 : " + remove);
}

private void removeFromMArrayByValue(MFastArray<String> list) {
    String remove = list.removeByValue("Apple");
    IO.println("value removed -> " + remove);
}
