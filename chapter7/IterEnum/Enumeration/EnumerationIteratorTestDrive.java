package IterEnum.Enumeration;

import java.util.Vector;

public class EnumerationIteratorTestDrive {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        EnumerationIterator enumerationIterator = new EnumerationIterator(vector.elements());
        while (enumerationIterator.hasNext()) {
            System.out.println(enumerationIterator.next());
        }
    }
}
