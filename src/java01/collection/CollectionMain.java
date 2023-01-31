package java01.collection;

import java01.collection.list.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionMain {

    // arrayList LinkedList
    public static void main(String[] args) {

        Array array = new Array();

        List<String> stringList = new ArrayList<>(Arrays.asList("a", "b", "c"));
        array.addArray(stringList);

        array.getArray();

        array.resetArray();

        array.getArray();

    }
}
