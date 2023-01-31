package java01.collection.list;

import java.util.ArrayList;
import java.util.List;

public class Array {

    List<String> al;

    public Array() {}

    public void resetArray() {
        al = new ArrayList<>();
    }

    private void emptyArray() {
        System.out.println("empty array");
        System.exit(0);
    }

    public void getArray() {
        if (al.isEmpty()) {
            emptyArray();
        }
        System.out.println("array list : " + al);
    }

    public void addArray(List<String> stringList) {

        if (stringList.isEmpty()) {
            emptyArray();
            return;
        }

        for (String sl : stringList) {
            al.add(sl);
        }
    }
}
