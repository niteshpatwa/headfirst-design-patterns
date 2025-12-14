package IterEnum.Iterator;

import java.util.Vector;

public class IteratorEnumerationTestDrive {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Dog");
        vector.add("Elephant");
        vector.add("Frog");

        IteratorEnumeration iteratorEnumeration = new IteratorEnumeration(vector.iterator());
        while (iteratorEnumeration.hasMoreElements()) {
            System.out.println(iteratorEnumeration.nextElement());
        }
    }
}
